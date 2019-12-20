package com.codegym.cms.entity;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_blog")
    private String name_blog;

    @Column(name = "content")
    private String content;

    @Column(name = "author")
    private String author;

    public Blog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_blog() {
        return name_blog;
    }

    public void setName_blog(String name_blog) {
        this.name_blog = name_blog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blog [id=" + id + ", name_blog=" + name_blog + ", content=" + content + ", author=" + author + "]";
    }
}