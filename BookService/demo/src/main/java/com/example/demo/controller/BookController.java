package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookService.insertBook(book);
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }
}
