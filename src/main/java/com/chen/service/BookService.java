package com.chen.service;

import com.chen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增
    int addBook(Books books);
    //删
    int deleteBook(int id);
    //改
    int updateBook(Books books);
    //查询
    Books queryBook(int id);
    //查询全部书籍
    List<Books> queryAllBook();

}
