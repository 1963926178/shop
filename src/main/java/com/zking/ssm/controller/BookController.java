package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/book")//窄化路径
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model){
        System.out.println("init");
//        model.addAttribute("name","周杰伦");
        Book book = new Book();
        book.setBookName("格林童话");
        book.setPrice(11f);
        model.addAttribute("book",book);
    }

    @RequestMapping("/add")
    public String add(Book book, HttpSession session){
        bookService.insert(book);
        session.setAttribute("msg","新增成功");
        return "redirect:/book/toAdd";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/book/addBook";
    }

    @RequestMapping("/del")
    public String del(){
        return null;
    }

    @RequestMapping("/edit")
    public String edit(){
        return null;
    }

    @RequestMapping("/load/{bookId}")
    @ResponseBody
    public JsonData load(@PathVariable Integer bookId){
        Book book = bookService.selectByPrimaryKey(bookId);
        JsonData jsonData = new JsonData();
        jsonData.setResult(book);
        return jsonData;
    }


}
