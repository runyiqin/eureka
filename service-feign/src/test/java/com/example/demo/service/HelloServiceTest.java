package com.example.demo.service;

import com.example.demo.ServiceFeignApplicationTests;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceTest extends ServiceFeignApplicationTests {

    @Autowired
    HelloService helloService;

    public void hello(){
        String hello = helloService.hello("feign");
        Assert.assertEquals(hello,"hello===feign");
    }
}
