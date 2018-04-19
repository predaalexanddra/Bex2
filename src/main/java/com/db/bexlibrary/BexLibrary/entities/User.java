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
    private boolean flagBlacklist;
    @Nullable
    private Date blackDate;
    @NotNull
    private boolean flagAdmin = false ;
    @NotNull
    private int noBorrowed = 0;

   @OneToMany(mappedBy = "loanUser")
   private List<Loan> LoanList;

}
