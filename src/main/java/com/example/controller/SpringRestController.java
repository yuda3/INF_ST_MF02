package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringRestController {
    @RequestMapping("/rest")
    public List<String> rest(){
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("do");
        list.add("well");
        return list;

    }
}
