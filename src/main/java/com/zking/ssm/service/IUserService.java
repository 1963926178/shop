package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.utils.PageBean;

import java.util.List;

public interface IUserService {

    List<Book> listUser(Book book, PageBean pageBean);

}
