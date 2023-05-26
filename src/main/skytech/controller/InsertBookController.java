package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.Book;
import skytech.service.impl.BookServiceImpl;

@Controller
public class InsertBookController {

    @Autowired
    private BookServiceImpl bookServiceimpl;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";


    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }


    @PostMapping("/insertbook")
    public ModelAndView insertBook(@ModelAttribute Book book, ModelAndView modelAndView) {
        bookServiceimpl.insertBook(book);
        modelAndView.setViewName("booksubmitsuccess");
        return modelAndView;
    }

}
