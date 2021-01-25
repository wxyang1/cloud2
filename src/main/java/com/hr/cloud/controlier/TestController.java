package com.hr.cloud.controlier;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class TestController {
        @RequestMapping("/hello")
        public String t1(String name){
            return  "你好8760"+name;
        }
    }

