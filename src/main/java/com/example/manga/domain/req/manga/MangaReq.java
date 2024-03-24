package com.example.manga.model.domain.req.manga;

import java.io.Serializable;

public class MangaReq implements Serializable {
    private Long id;
    private String name;
    private String author;
    private String pubDate;
    private String status;
    private String description;
    private String follower;
    private Long score;
    private String cover;
    private String category;

    public MangaReq() {
    }

    public MangaReq(Long id, String name, String author, String pubDate, String status, String description, String follower, Long score, String cover, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pubDate = pubDate;
        this.status = status;
        this.description = description;
        this.follower = follower;
        this.score = score;
        this.cover = cover;
        this.category = category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
