package com.db.bexlibrary.BexLibrary.entities;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;

    @NotNull
    private String password;

    @NotNull
    private int noPen = 0;
    @NotNull
    private boolean isBlacklist;
    @Nullable
    private Date blackDate;
    @NotNull
    private boolean isAdmin = false ;
    @NotNull
    private int noBorrowedBooks = 0;

   @OneToMany(mappedBy = "loanUser")
   private List<Loan> LoanList;

}
