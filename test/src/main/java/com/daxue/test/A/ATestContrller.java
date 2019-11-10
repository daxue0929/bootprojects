package com.daxue.test.A;

import com.daxue.test.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ATestContrller {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;




//    @GetMapping(value = "/a/message")
//    public Object mesage() {

//        ListOperations listOperations = redisTemplate.opsForList();

//        valueOperations.set("a","456");
//        valueOperations.set("b", "123");

//        for (int i = 100; i<120; i++) {
//            user.setId(i);
//            user.setName("test" + i);
//            user.setAge(i-50);
//
//            listOperations.leftPush("tt", user);
//        }
//        User userTemp = null;
//        Long size = listOperations.size("user");
//        for (int i = 0; i< size; i++) {
//            userTemp = (User) listOperations.index("tt", i);
//            if (user.getId() == 103) {
//                Long remove = listOperations.remove("tt", i, user);
//            }

//        }
//        userTemp = (User) listOperations.index("tt", 3);

//        List<User> userList = (List<User>) listOperations.range("user", 0, size);
//
//        List<User> users = new ArrayList<>();
//        userList.forEach((temp) -> {
//            if (temp.getId() == 105) {
//                users.add(temp);
//            }
//        });
//        return listOperations.size("tt");
//        return listOperations.leftPop("tt");
//        return users;
//    }

    @GetMapping(value = "/a/getAllList")
    public Object test001() {
        List<User> user = (List<User>) redisUtil.getAllList("user");



        return user;
    }

    @GetMapping(value = "test02")
    public User test02() {
        User user = new User();
        user.setId(123);
        user.setAge(18);
        user.setName("王雪迪");

        return user;
    }

    @GetMapping(value = "index")
    public String index() {
        System.out.println("执行方法内内容");

        return "123";
    }
}
