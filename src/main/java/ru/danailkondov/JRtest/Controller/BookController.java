package ru.danailkondov.JRtest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.danailkondov.JRtest.Entity.Book;
import ru.danailkondov.JRtest.Service.BookService;

/**
 * Created on 14.02.2018.
 */
@Controller
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(path = "")
    public String viewBooksList (
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "id") String sortBy,
            @RequestParam(required = false, defaultValue = "ask") String order,
            Model uiModel
    ){
        Sort sort;
        if (order.equals("desc")) sort = new Sort(Sort.Direction.DESC, sortBy);
        else sort = new Sort(Sort.Direction.ASC, sortBy);

        //Нумерация страниц для Spring Data JPA начинается с 0
        Integer pageNumber = (page > 0) ? page - 1 : 0;
        PageRequest pageRequest = new PageRequest(pageNumber, 10, sort);
        Page<Book> books = bookService.findAllByPage(pageRequest);

        uiModel.addAttribute("books", books.getContent());

        return "books/list";
    }
}
