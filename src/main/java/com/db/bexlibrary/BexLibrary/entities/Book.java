package com.db.bexlibrary.BexLibrary.entities;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String title;

    @Nullable
    private double rating = 0.0;

    @Nullable
    private int givenRatings = 0;

    @NotNull
    private int noCopies;

    @NotNull
    private int noAvailableCopies;

    @NotNull
    private String imgPath;


    @ManyToOne
    @JoinColumn(name = "fk_bookCategory")
    private Category category;

    @ManyToMany
    @JoinTable(name = "Book_Author",joinColumns = {@JoinColumn(name="fk_idBook")}, inverseJoinColumns ={ @JoinColumn(name="fk_idAuthor")}




    )
    private List<Author> author;

    @OneToMany(mappedBy = "book")
    private List<KeyWords> keyWords;


    @OneToMany(mappedBy = "loanBook")
    private List<Loan>  BookLoan;



}
