package ru.danailkondov.JRtest.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.danailkondov.JRtest.Entity.Book;
import ru.danailkondov.JRtest.Service.BookService;

import java.util.List;

/**
 * Created on 12.02.2018.
 */
@Controller
@RequestMapping(path = "/books")
public class BookController {

    final Logger logger = LoggerFactory.getLogger(BookController.class);

    /**
     * Свойства класса с аннотацией @Autowired заполняются соответствующими значениями сразу
     * после создания bean'а и перед тем, как любой из методов класса будет вызван.
     */
    @Autowired
    private BookService bookService;

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * Specifically, @GetMapping is a composed annotation that acts as a shortcut
     * for @RequestMapping(method = RequestMethod.GET).
     * @return list of books
     */
    @GetMapping(path = "")
    public @ResponseBody List<Book> getAllBooks(){
        return bookService.findAll();
    }

    @GetMapping(path = "/find")
    public @ResponseBody Book findBookById(@RequestParam("id") Long id) {
        return bookService.findById(id);
    }

    @PostMapping(value = "")
    public @ResponseBody Book create(@RequestBody Book book){
        logger.info("Creating book: " + book);
        bookService.save(book);
        logger.info("Book created successfully with info: " + book);
        return book;
    }

    @PutMapping(value = "/update")
    public @ResponseBody void update(@RequestBody Book book, @RequestParam("id") Long id){
        logger.info("Updating book: " + book);
        bookService.save(book);
        logger.info("Book update successfully with info: " + book);
    }

    @DeleteMapping(value = "/delete")
    public @ResponseBody void delete(@RequestParam("id") Long id){
        logger.info("Deleting book with id: " + id);
        Book book = bookService.findById(id);
        bookService.delete(book);
        logger.info("book deleted successfully");
    }
}
