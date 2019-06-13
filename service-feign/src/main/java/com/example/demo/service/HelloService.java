package com.example.demo.service;

import com.example.demo.service.hystrix.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
