package com.daxue.test.A;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

@Service
public class AService {


    private static int compare(User o1, User o2) {
        return o1.getAge().compareTo(o2.getAge());
    }

    /**
     * start write the method of this class
     */
    public void test() {
        Integer[] array = {1,8,15,7,99,28,35};

        List a = new ArrayList(Arrays.asList(array));


        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(a, Comparator.reverseOrder());

        Collections.sort(a, Comparator.naturalOrder());

        User user1 = new User(1,"da", 18);
        User user2 = new User(2,"xue", 25);
        User user3 = new User(3,"daxuexue", 35);

        List list = new ArrayList();

        list.add(user1);
        list.add(user3);
        list.add(user2);
        System.out.println(list.iterator().next());

        Collections.sort(list, AService::compare);

        list.sort(Comparator.comparing(User::getAge));

    }

    public  File[] filterItem() {

        File fileList = new File("C:\\");

        File[] files = fileList.listFiles(File::isHidden);

        return files;
    }


}
