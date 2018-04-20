package com.db.bexlibrary.BexLibrary.controllers;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.entities.Category;
import com.db.bexlibrary.BexLibrary.repositories.BookRepo;
import com.db.bexlibrary.BexLibrary.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    public CategoryRepo categoryRepo;

    @GetMapping(value = "/books")
    public List<Category> generate(){

        return categoryRepo.findAll();
    }

}
