package entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

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
    private boolean returned = false;



    @ManyToOne()
    @JoinColumn(name = "loanUser")
    private User loanUser;

    @ManyToOne()
    @JoinColumn(name = "bookCEVA")
    private Book loanBook;

}
