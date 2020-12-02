package com.xiaoxue.democonsumer.test;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Test01 {
    @Test
    public void test001() {
        File file = new File("/Users/daxue0929/openSourceCodes/bootprojects");
        File[] files = file.listFiles(File::isHidden);
        for (File f: files) {
            System.out.println(f.getName());
        }
    }

}
