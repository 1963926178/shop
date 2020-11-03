package com.zking.ssm.service.impl;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest extends BaseTestCase{

    @Autowired
    private IBookService bookService;
    private Book book;

    @Override
    public void setUp() {
        super.setUp();
        book = new Book();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        book.setBookName("格林童话");
        book.setPrice(15f);
        bookService.insert(book);
        System.out.println(book.getBookId());
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        book.setBookId(1);
        Book book = bookService.selectByPrimaryKey(1);
        System.out.println(book);

        System.out.println("========================");

        book.setBookId(1);
        Book book1 = bookService.selectByPrimaryKey(1);
        System.out.println(book1);


    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listBook() {
        pageBean.setPage(1);
        pageBean.setRows(10);
        List<Book> list = bookService.listBook(book,pageBean);
        for (Book book1 : list) {
            System.out.println(book1);
        }

        System.out.println("===================");

        pageBean.setPage(2);
        pageBean.setRows(3);
        List<Book> list1 = bookService.listBook(book,pageBean);
        for (Book book1 : list1) {
            System.out.println(book1);
        }
    }
}
