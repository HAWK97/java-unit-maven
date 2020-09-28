package com.example.demo;

import com.example.demo.util.Medium;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HelloTest {
    @Test
    public void helloTest() {
        List<Long> list=new ArrayList<>();
        list.add(new Long(2));
        list.add(new Long(3));
        list.add(new Long(1));
//        System.out.println(list);
        Medium.median(list);
//        System.out.println(list);
        Assert.assertEquals(new Long(1),list.get(0));
    }
}
