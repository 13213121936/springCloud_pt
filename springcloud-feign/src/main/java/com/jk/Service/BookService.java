package com.jk.Service;

import com.jk.model.BookBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "service-provider")
public interface BookService {

    @GetMapping("queryBookList")
    @ResponseBody
    List<BookBean> queryBookList();

    @PostMapping("addBook")
    @ResponseBody
    void addBook(@RequestBody BookBean bookBean);

}
