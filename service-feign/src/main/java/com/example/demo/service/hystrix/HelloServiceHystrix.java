package com.example.demo.service.hystrix;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello(String name) {

        return "feign 返回错误数据";
    }
}
