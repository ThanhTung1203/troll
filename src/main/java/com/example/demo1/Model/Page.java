package com.example.demo1.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Page {
    int id;
    String content;
    String title;
    LocalDateTime time = LocalDateTime.now();
    int likes ;
    String category;

    public Page(int id, String content, String title,  int likes, String category) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.likes = likes;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}