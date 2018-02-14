package ru.danailkondov.JRtest.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.danailkondov.JRtest.Entity.Book;

import java.util.List;

/**
 * Created on 12.02.2018.
 */
public interface BookService {

    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Book book);
    Page<Book> findAllByPage(Pageable pageable);
    Book update(Book book, Long id);
    Page<Book> search(String term, int printYear, Pageable pageable);
    Page<Book> search(String term, int printYear, boolean readAlReady, Pageable pageable);
}
