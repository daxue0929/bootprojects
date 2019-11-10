package com.daxue.test.A;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AServiceTest {

    @Autowired
    public AService aService;

    @Before
    public void setUp() {
        System.out.println("测试类AServiceTest开始初始化---->");
    }

    @Test
    public void test() {

        aService.test();

        System.out.println("结束");
    }

    @Test
    public void filterItem() {

        File[] files = aService.filterItem();



        ArrayList<File> files2 = new ArrayList<>(Arrays.asList(files.clone()));


//        数组转列表
//        asList返回的列表没有add和remove方法，是一个内部方法。

        ArrayList<File> files1 = (ArrayList<File>) Arrays.asList(files);


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);

//        列表转数组
        Integer[] integers1 = integers.toArray(new Integer[0]);

        Integer[] array = integers.toArray(new Integer[0]);
        for (Integer integer : array) {

        }


//        for (File file : files) {
//            System.out.println(file);
//        }


    }
}
