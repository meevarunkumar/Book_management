package skytech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import skytech.dao.impl.BookDaoImpl;
import skytech.model.Book;
import skytech.service.BookService;

import java.util.List;


public class BookServiceImpl implements BookService {

    @Autowired
    private BookDaoImpl bookDao;

    @Override
    public int insertBook(Book book) {
        return bookDao.insertBook(book);
    }

    @Override
    public List<Book> getBookDetails() {
        return bookDao.getBookDetails();
    }

    @Override
    public Book getBookDetailsById(int id) {
        return bookDao.getBookDetailsById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookDao.deleteBook(id);
    }
}
