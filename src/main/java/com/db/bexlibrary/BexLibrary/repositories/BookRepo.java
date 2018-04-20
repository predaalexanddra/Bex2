package com.db.bexlibrary.BexLibrary.repositories;

import com.db.bexlibrary.BexLibrary.entities.Book;
import com.db.bexlibrary.BexLibrary.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookRepo extends JpaRepository<Book,Long> {

    //List<Book> findBooksByCategory_IdCategory(Long id);
    Book findBooksById(Long id);
}
