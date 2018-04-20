package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.entities.Category;
import com.db.bexlibrary.BexLibrary.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin(origins="http://localhost:port", allowedHeaders = "*")
public class BooksController {


    @Autowired
    public BookRepo bookRepo;


    @GetMapping(value = "/book", produces = MediaTypes.ALPS_JSON_VALUE)
    public List<Book> findBooks(){

        return bookRepo.findAll();


    }

}
