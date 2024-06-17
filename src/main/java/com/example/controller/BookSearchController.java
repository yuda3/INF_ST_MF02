package com.example.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class BookSearchController {

    @GetMapping("/search/books")
    public ResponseEntity<String> searchBooks(String title){
        //kakao bookSearch Open API URL
        final String url ="https://dapi.kakao.com/v3/search/book?query="+ title;

        HttpHeaders headers = new HttpHeaders();
        String APIKEY = "33c081910ca14e182717edeeb10735f0";
        headers.set("Authorization", "KakaoAK " + APIKEY);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);


        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response.getBody());
    }

}
