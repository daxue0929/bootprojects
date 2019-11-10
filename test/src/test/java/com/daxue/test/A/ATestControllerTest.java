package com.daxue.test.A;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ATestControllerTest {

    @Autowired
    ATestContrller aTestContrller;

    //初始化
    @Before
    public void setUp() {
        System.out.println("执行初始化");
    }

    @Test
    public void index() {
        String index = aTestContrller.index();
        System.out.println(index);
    }

    @Test
    public void test02() {
        User user = aTestContrller.test02();
        Assert.assertThat(user.getName(), is("王雪迪"));
    }
}
