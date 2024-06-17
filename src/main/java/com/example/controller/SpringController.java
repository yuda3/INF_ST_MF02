package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SpringController {

    @Autowired
    private BookMapper mapper;

    @RequestMapping("/spring")
    public String index(){
        return "template";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Book> list = mapper.bookList();
        model.addAttribute("list",list);
        return "list";
    }
}
