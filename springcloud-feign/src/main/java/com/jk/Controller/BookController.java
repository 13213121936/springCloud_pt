package com.jk.Controller;

import com.jk.Service.BookService;
import com.jk.model.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("queryBookList")
    @ResponseBody
    public List<BookBean> queryBookList(){

        return  bookService.queryBookList();
    }

    @PostMapping("addBook")
    @ResponseBody
    public  void  addBook(BookBean bookBean){

        bookService.addBook(bookBean);

    }

 }
