package com.db.bexlibrary.BexLibrary.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "noPen")
    private int noPen = 0;

    @NotNull
    @Column(name = "isBlackList")
    private boolean isBlacklist;

    @Nullable
    @Column(name = "blackDate")
    private Date blackDate;

    @NotNull
    @Column(name = "isAdmin")
    private boolean isAdmin = false;

    @NotNull
    @Column(name = "noBorrowedBooks")
    private int noBorrowedBooks = 0;

    @JsonIgnore
    @OneToMany(mappedBy = "loanUser")
    private List<Loan> LoanList;

    @ManyToMany
    @JoinTable(name = "Wishlist", joinColumns = {@JoinColumn(name = "fk_idUser")}, inverseJoinColumns = {@JoinColumn(name = "fk_idBook")})
    private List<Book> books;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNoPen() {
        return noPen;
    }

    public void setNoPen(int noPen) {
        this.noPen = noPen;
    }

    public boolean isBlacklist() {
        return isBlacklist;
    }

    public void setBlacklist(boolean blacklist) {
        isBlacklist = blacklist;
    }

    public Date getBlackDate() {
        return blackDate;
    }

    public void setBlackDate(Date blackDate) {
        this.blackDate = blackDate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getNoBorrowedBooks() {
        return noBorrowedBooks;
    }

    public void setNoBorrowedBooks(int noBorrowedBooks) {
        this.noBorrowedBooks = noBorrowedBooks;
    }

    public List<Loan> getLoanList() {
        return LoanList;
    }

    public void setLoanList(List<Loan> loanList) {
        LoanList = loanList;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
