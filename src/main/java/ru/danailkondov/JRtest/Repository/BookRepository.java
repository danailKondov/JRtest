package ru.danailkondov.JRtest.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.danailkondov.JRtest.Entity.Book;

/**
 * Created 11.02.2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
