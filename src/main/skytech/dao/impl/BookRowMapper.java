package skytech.dao.impl;

import org.springframework.jdbc.core.RowMapper;
import skytech.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt(1));
        book.setName(rs.getString(2));
        book.setPages(rs.getInt(3));
        book.setPrice(rs.getDouble(4));
        return book;
    }
}
