package ru.danailkondov.JRtest.Service;

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
}
