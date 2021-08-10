package com.chen.dao;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增
    int addBook(Books books);
    //删
    int deleteBook(@Param("bookID") int id);
    //改
    int updateBook(Books books);
    //查询
    Books queryBook(@Param("bookID") int id);
    //查询全部书籍
    List<Books> queryAllBook();

}
