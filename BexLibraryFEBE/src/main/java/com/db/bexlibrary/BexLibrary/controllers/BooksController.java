package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.repositories.BookRepo;
import com.db.bexlibrary.BexLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class BooksController {


    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/books")
    public List<Book> findBooks() {
        return bookRepo.findAll();
    }

//    @GetMapping(value = "/isLoggedIn")
//    public ResponseEntity<Boolean> isLoggedIn() {
//        return new ResponseEntity<Boolean>(GlobalVariables.getInstance().getEmail() != null && !GlobalVariables.getInstance().getEmail().isEmpty() , HttpStatus.OK );
//    }

//    @GetMapping(value = "/logOut")
//    public ResponseEntity<Boolean> logOut() {
//        GlobalVariables.getInstance().setEmail(null);
//        return new ResponseEntity<Boolean>(true, HttpStatus.OK );
//    }


    @GetMapping(value = "/booksbyauthor")
    public Set<Book> findBookByAuthor(@RequestParam(name="name")String name) {
        return bookService.findBooksByAuthorName(name);
    }

    @GetMapping(value="/popular")
    public  List<Book> findPopular(){
        return bookRepo.findBooksByRatingGreaterThanEqual(3.5);
    }


}
