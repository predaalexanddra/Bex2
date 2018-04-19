package com.db.bexlibrary.BexLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan( basePackages = "entities" )
public class BexLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BexLibraryApplication.class, args);
	}
}
