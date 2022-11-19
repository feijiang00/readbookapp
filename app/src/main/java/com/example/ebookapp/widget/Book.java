package com.example.ebookapp.widget;

/**
 * 书本抽象化
 */
public class Book {
    private String title;
    private String location;

    public Book(String title, String location){
        this.title = title;
        this.location = location;
    }

    public String getLocation(){
        return this.location;
    }

    public String getTitle(){
        return this.title;
    }
}
