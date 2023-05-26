package skytech.service;

import skytech.model.Book;

import java.util.List;

public interface BookService {
    public int insertBook(Book book);
    public List<Book> getBookDetails();
    public Book getBookDetailsById(int id);
    public int updateBook(Book book);
    public int deleteBook(int id );
}
