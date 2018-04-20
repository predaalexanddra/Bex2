package com.db.bexlibrary.BexLibrary.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "email") private String email;

    @NotNull
    @Column(name = "password") private String password;

    @NotNull
    @Column(name = "noPen")private int noPen = 0;

    @NotNull
    @Column(name = "isBlackList") private boolean isBlacklist;

    @Nullable
    @Column(name = "blackDate") private Date blackDate;

    @NotNull
    @Column(name = "isAdmin") private boolean isAdmin = false ;

    @NotNull
    @Column(name = "noBorrowedBooks") private int noBorrowedBooks = 0;

    @JsonIgnore
    @OneToMany(mappedBy = "loanUser")
    private List<Loan> LoanList;

    @ManyToMany
    @JoinTable(name = "Wishlist",joinColumns = {@JoinColumn(name="fk_idUser")}, inverseJoinColumns ={ @JoinColumn(name="fk_idBook")})
    private List<Book> books;


}
