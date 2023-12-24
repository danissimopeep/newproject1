package com.example.blog.models;

import jakarta.persistence.*;
import lombok.*;



@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anons, full_text;
    private int views;

    public int getViews() {
        return views;
    }

    public Long getId() {
        return id;
    }

    public String getAnons() {
        return anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public String getTitle() {
        return title;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public Post(){

    }
    public Post(String title,String anons,String full_text){
        this.anons=anons;
        this.full_text=full_text;
        this.title=title;
    }
}

