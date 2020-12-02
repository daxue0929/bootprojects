package com.xiaoxue.democonsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
//@EnableDiscoveryClient  开启 Spring Cloud 的注册发现功能。不过从 Spring Cloud Edgware 版本开始，实际上已经不需要添加 @EnableDiscoveryClient 注解
public class DemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }

    @Configuration
    public class RestTemplateConfiguration {

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

    }


    @RestController
    static class TestController {


        /**
         * 服务发现客户端，上文我们已经介绍过。
         * 这里我们注入的不是 Nacos Discovery 提供的 NacosDiscoveryClient，保证通用性。
         * 未来如果我们不使用 Nacos 作为注册中心，而是使用 Eureka 或则 ZooKeeper 时，
         * 则无需改动这里的代码
         */
        @Autowired
        private DiscoveryClient discoveryClient;
        @Autowired
        private RestTemplate restTemplate;

        /**
         * 负载均衡客户端：
         * 从 zookeeper 获取的服务 test-zookeeper-demo-provider 的实例列表中，选择一个进行 HTTP 调用。
         */
        @Autowired
        private LoadBalancerClient loadBalancerClient;

        @GetMapping("/hello")
        public String hello(String name) {
            // <1> 获得服务 `demo-provider` 的一个实例
            ServiceInstance instance;
            if (true) {
                // 获取服务 `demo-provider` 对应的实例列表
                List<ServiceInstance> instances = discoveryClient.getInstances("test-zookeeper-demo-provider");
                // 选择第一个
                instance = instances.size() > 0 ? instances.get(0) : null;
            } else {
                instance = loadBalancerClient.choose("test-zookeeper-demo-provider");
            }
            // <2> 发起调用
            if (instance == null) {
                throw new IllegalStateException("获取不到实例");
            }
            String targetUrl = instance.getUri() + "/echo?name=" + name;
            String response = restTemplate.getForObject(targetUrl, String.class);
            // 返回结果
            return "consumer:" + response;
        }

    }



}
