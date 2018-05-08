package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.repositories.BookRepo;
import com.db.bexlibrary.BexLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class SearchController {

    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private BookService bookService;

    @GetMapping(value="/search")
    private List<Book> searchMethod(@RequestParam(name="title") String title){
        List<Book> results=new ArrayList<>();
        System.out.println(title);

        results.addAll(bookService.findBooksByAuthorName(title));
        results.addAll(bookRepo.findBooksByTitleContaining(title));
//        System.out.println(results);
        return results;
    }

}
