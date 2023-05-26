package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import skytech.service.impl.BookServiceImpl;

@Controller
public class DeleteStudentController {

    @Autowired
    private BookServiceImpl bookServiceimpl;

    @GetMapping("getbyid/delete")
    public String deleteBook(@RequestParam int id) {
    bookServiceimpl.deleteBook(id);
    return "redirect:/getbooklist";
    }

}
