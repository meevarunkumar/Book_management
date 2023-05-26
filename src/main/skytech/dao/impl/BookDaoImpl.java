package skytech.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;
import skytech.dao.BookDao;
import skytech.model.Book;
import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Override
    public int insertBook(Book book) {
        String query = "insert into book(name , pages , price ) values(?,?,?)";
        return getJdbctemplate().update(query, book.getName(), book.getPages(), book.getPrice());
    }

    @Override
    public List<Book> getBookDetails() {
        String query = "select * from book";
        return getJdbctemplate().query(query,new BookRowMapper());
    }

    @Override
    public Book getBookDetailsById(int id) {
        String query = "select * from book where bookId =?";
        return jdbctemplate.queryForObject(query, new BookRowMapper(), id);
    }

    @Override
    public int updateBook(Book book) {
        String query = "update book set name =?, pages=?, price=? where bookId =?";
        return jdbctemplate.update(query , book.getName(), book.getPages(), book.getPrice(), book.getId());
    }

    @Override
    public int deleteBook(int id) {
        String query = "delete from book where bookId=?";

        return jdbctemplate.update(query,id);
    }

    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }
}
