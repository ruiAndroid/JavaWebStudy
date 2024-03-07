package com.ssm2.mapper;

import com.ssm2.bean.Author;
import com.ssm2.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    List<Book> getBookByAuthorFirstName(String author);
    List<Book> getBookByBookId(int bookId);

    List<Book> getBookById(Integer id);

   Book getBookById2(@Param("id") Integer id);
   Author getAuthorById(@Param("aid") Integer aid);

}
