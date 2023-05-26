package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.Book;
import skytech.service.impl.BookServiceImpl;

import java.util.List;

@Controller
public class ReadBookController {

    @Autowired
    private BookServiceImpl bookServiceimpl;

    @GetMapping("/getbooklist")
    public ModelAndView getBookList(ModelAndView modelAndView) {
        List<Book> bookDetails = bookServiceimpl.getBookDetails();
        modelAndView.addObject("bookdetails", bookDetails);
        modelAndView.setViewName("getBookList");
        return modelAndView;
    }

    @GetMapping("/getbyid/{id}")
    public ModelAndView getBookById(@PathVariable int id, ModelAndView modelAndView) {
        Book book = bookServiceimpl.getBookDetailsById(id);
        modelAndView.addObject(book);
        modelAndView.setViewName("bookdata");
        return modelAndView;
    }
//    @ResponseBody
//    @GetMapping(value = "/getbooklistdata" ,produces = MediaType.APPLICATION_JSON_VALUE)
//    public String getBookList() {
//        List<Book> bookDetails = bookServiceimpl.getBookDetails();
//        System.out.println(bookDetails);
//        return bookDetails.toString();
//    }


}
