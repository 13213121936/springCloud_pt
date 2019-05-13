package com.jk.Mapper;

import com.jk.model.BookBean;
import org.apache.ibatis.annotations.Insert;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookMapper {


    List<BookBean> queryBookList();



    void addBook(@RequestBody BookBean bookBean);

}
