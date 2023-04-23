package com.kdacademy.graphql.mutations.demo.mutationsdemo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String comment;

    public Review() {
    }

    public Review(String title, String comment) {
        this.title = title;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", title=" + title + ", comment=" + comment + "]";
    }
}
