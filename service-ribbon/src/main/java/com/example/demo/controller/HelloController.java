package com.example.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(){
        return restTemplate.getForObject("http://eureka-client/hello?name=ribbon",String.class);
    }

    public String helloError(){
        return "ribbon 返回错误信息";
    }
}
