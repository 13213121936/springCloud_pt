package com.jk.Service;

import com.jk.Mapper.BookMapper;
import com.jk.model.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookService {

    @Autowired
    private BookMapper bookMapper;
    @GetMapping("queryBookList")
    @ResponseBody
    public  List<BookBean> queryBookList(){


        return  bookMapper.queryBookList();
    }


    @PostMapping("addBook")
    @ResponseBody
    public  void addBook(@RequestBody BookBean bookBean){
        bookMapper.addBook(bookBean);
    }




}
