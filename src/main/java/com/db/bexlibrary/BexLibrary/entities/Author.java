package com.db.bexlibrary.BexLibrary.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String authorName;

    @ManyToMany(mappedBy ="author")
    private List<Book> book;

}
