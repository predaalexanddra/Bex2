package entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> booklist;
}
