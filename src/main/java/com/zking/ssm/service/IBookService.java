package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.utils.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {

    @Transactional
    int deleteByPrimaryKey(Integer bookId);

    @Transactional
    int insert(Book record);

    @Transactional
    int insertSelective(Book record);

    @Transactional(readOnly = true)
    Book selectByPrimaryKey(Integer bookId);

    @Transactional
    int updateByPrimaryKeySelective(Book record);

    @Transactional
    int updateByPrimaryKey(Book record);

    @Transactional(readOnly = true)
    List<Book> listBook(Book book, PageBean pageBean);

}
