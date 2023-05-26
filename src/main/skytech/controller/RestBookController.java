package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import skytech.model.Book;
import skytech.service.impl.BookServiceImpl;

import java.lang.invoke.MethodType;
import java.util.List;

@RestController
public class RestBookController {
    @Autowired
    private BookServiceImpl bookServiceimpl;

    @GetMapping(value = "/getbooklistdata" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBookList() {
        List<Book> bookDetails = bookServiceimpl.getBookDetails();
        System.out.println(bookDetails);
        return bookDetails;

    }
    @GetMapping(value = "/getbookbyid/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable int id) {
        Book bookDetail= bookServiceimpl.getBookDetailsById(id);
        System.out.println(bookDetail);
        return bookDetail;
    }




}
