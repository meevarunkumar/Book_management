package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.Book;
import skytech.service.impl.BookServiceImpl;

@Controller
public class UpdateBookController {
    @Autowired
    private BookServiceImpl bookServiceimpl;

    @GetMapping("getbyid/bookdata")
    public ModelAndView getBookData(@RequestParam("id") int id, ModelAndView model) {
        Book bookDetailsById = bookServiceimpl.getBookDetailsById(id);
        model.addObject(bookDetailsById);
        model.setViewName("updateBook");
        return model;
    }


    @PostMapping("getbyid/bookdata/updatebook")
    public String updateBook(@ModelAttribute Book book){
        int i = bookServiceimpl.updateBook(book);
        return "redirect:/getbooklist";
    }
}
