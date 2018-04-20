package com.db.bexlibrary.BexLibrary.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Data
public class Loan {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private Date borrowDate;
    @NotNull
    private Date returnDate;
    @NotNull
    private boolean isReturned = false;



    @ManyToOne()
    @JoinColumn(name = "fk_loanUser")
    private User loanUser;

    @ManyToOne()
    @JoinColumn(name = "fk_loanBook")
    private Book loanBook;

}
