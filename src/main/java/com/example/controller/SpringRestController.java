package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpringRestController {
    @RequestMapping("/rest")
    public @ResponseBody List<String> rest(){
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("do");
        list.add("well");
        return list;

    }
}
