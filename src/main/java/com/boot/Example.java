package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/25 0025.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }

}
