package com.example.demo.service;


import com.example.demo.model.Book;
import com.example.demo.repository.BookRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{

    @Autowired
    private BookRep bookRep;

    public Book getBookById(int id ){
        return  bookRep.findById(id).get();
    }

    public Book insertBook(Book book ){
        return  bookRep.save(book);
    }

}