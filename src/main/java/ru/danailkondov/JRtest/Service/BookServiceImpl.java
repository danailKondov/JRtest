package ru.danailkondov.JRtest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.danailkondov.JRtest.Entity.Book;
import ru.danailkondov.JRtest.Repository.BookRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created on 12.02.2018.
 *
 * Аннотация @Service (сервис-слой приложения) объявляет, что этот класс представляет собой
 * сервис – компонент сервис-слоя, содержащий бизнес-логику.
 *
 * Аннотация @Repository (доменный слой) показывает, что класс функционирует как репозиторий и требует наличия прозрачной
 * трансляции исключений. Преимуществом трансляции исключений является то, что слой сервиса будет
 * иметь дело с общей иерархией исключений от Spring (DataAccessException) вне зависимости
 * от используемых технологий доступа к данным в слое данных.
 */
@Service("bookService")
@Repository
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    /**
     * Перед исполнением метода помеченного аннотацией @Transactional начинается транзакция,
     * после выполнения метода транзакция коммитится, при выбрасывании RuntimeException откатывается.
     * @return list of books
     */
    @Override
    @Transactional(readOnly=true)
    public List<Book> findAll() {
        Iterable<Book> iterable = bookRepository.findAll();
        Iterator<Book> bookIterator = iterable.iterator();
        List<Book> result = new ArrayList<>();
        while(bookIterator.hasNext()) {
            result.add(bookIterator.next());
        }
        return result;
    }

    @Override
    @Transactional(readOnly=true)
    public Book findById(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
