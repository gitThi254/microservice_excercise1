package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Library;
import com.example.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @Autowired
    private RestTemplate restTemplate;


    @PostMapping
    public Library save(@RequestBody Library library) {
        return libraryService.saveLibrary(library);
    }
    @GetMapping("/{id}")
    public Library get(@PathVariable int id) {
        Book book  = restTemplate.getForObject("http://localhost:9093/book/"+id , Book.class);
        Library library = libraryService.getLibrary(id);
        library.setBook(book);
        return library;
    }
}
