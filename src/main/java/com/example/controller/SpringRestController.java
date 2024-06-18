package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> rest(){
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("do");
        list.add("well");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping("/restlist")
    public ResponseEntity<?> list(){
        List<Book> books = mapper.bookList();
        return new ResponseEntity<>(books, HttpStatus.ACCEPTED);
    }

    @PostMapping("/restsave")
    public ResponseEntity<?> saveBook(@RequestBody Book dto){
        mapper.saveBook(dto);
        return new ResponseEntity<>("success", HttpStatus.NOT_FOUND);
    }

}
