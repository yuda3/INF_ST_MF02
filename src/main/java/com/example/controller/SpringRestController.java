package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringRestController {
    @Autowired
    BookMapper mapper;

    @RequestMapping("/rest")
    public List<String> rest(){
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("do");
        list.add("well");
        return list;
    }

    @RequestMapping("/restlist")
    public List<Book> list(){
        return mapper.bookList();
    }

    @PostMapping("/restsave")
    public String saveBook(@RequestBody Book dto){
        mapper.saveBook(dto);
        return "success";
    }

}
