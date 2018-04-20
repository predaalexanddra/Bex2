package com.db.bexlibrary.BexLibrary;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@SpringBootApplication
@EntityScan( basePackages = "com/db/bexlibrary/BexLibrary/entities")
public class BexLibraryApplication {

	public static void main(String[] args){
		SpringApplication.run(BexLibraryApplication.class, args);
	}
//	@Override
//	public void run(String[] args) {
//
//		List<Book> books=bookRepo.findAll();
//		System.out.println(books);
//
//	}

}
