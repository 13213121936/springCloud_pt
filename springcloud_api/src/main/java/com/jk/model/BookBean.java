package com.jk.model;

import java.io.Serializable;

public class BookBean  implements Serializable {

    private static final long serialVersionUID = -5143857437337332874L;
    private  Integer  id;
    private  String   userName;
    private  String   bookName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
