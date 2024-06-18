package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/register")
    public String registerGet(){
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(@RequestBody Book dto){
        mapper.registerBook(dto);
        return "redirect:/list";
    }

    @GetMapping("/get/{num}")
    public String get(@PathVariable int num, Model model){
        Book book = mapper.get(num);
        model.addAttribute("book", book);
        return "get";
    }

    @GetMapping("/remove/{num}")
    public String remove(@PathVariable int num){
        mapper.remove(num);
        return "redirect:/list";
    }
    @GetMapping("/update/{num}")
    public String updateGet(@PathVariable int num, Model model){
        Book book = mapper.get(num);
        model.addAttribute("book",book);
        return "update";
    }
    @PostMapping("/update")
    public String updatePost(Book dto){
        mapper.update(dto);
        return "redirect:/get/" +dto.getNum();
    }

    @RequestMapping("/jsonList")
    public @ResponseBody List<Book> jsonList(){
        return mapper.bookList();
    }
}
