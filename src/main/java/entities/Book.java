package entities;

import lombok.Data;
import lombok.NoArgsConstructor;
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
    private int ratingsGiven = 0;

    @NotNull
    private int no_ex;

    @NotNull
    private int no_av_ex;

    @NotNull
    private String img_path;


    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

    @ManyToMany
    @JoinTable(name = "Book_Author")
    private List<Author> author;

    @OneToMany(mappedBy = "book")
    private List<KeyWords> keyWords;


    @OneToMany(mappedBy = "loanBook")
    private List<Loan>  BookLoan;



}
