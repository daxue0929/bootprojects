package com.daxue;

//import com.daxue.services.RedisService;
//import org.springframework.beans.factory.annotation.Autowired;
import com.daxue.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
public class OrmApplication {

    @Autowired
    public RedisService redisService;

    @GetMapping(value = "/")
    public String test() {
        String projectPath = System.getProperty("user.dir");
//        return redisService.hello();
        return projectPath;
    }


    public static void main(String[] args) { SpringApplication.run(OrmApplication.class, args); }
}
