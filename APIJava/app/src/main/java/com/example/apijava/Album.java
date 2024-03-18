package com.example.apijava;

public class Album {
    private String cover;
    private String cover_big;
    private String cover_medium;
    private String cover_small;
    private String cover_xl;
    private int id;
    private String md5_image;
    private String title;
    private String tracklist;
    private String type;

    public Album(String cover, String cover_big, String cover_medium, String cover_small, String cover_xl, int id, String md5_image, String title, String tracklist, String type) {
        this.cover = cover;
        this.cover_big = cover_big;
        this.cover_medium = cover_medium;
        this.cover_small = cover_small;
        this.cover_xl = cover_xl;
        this.id = id;
        this.md5_image = md5_image;
        this.title = title;
        this.tracklist = tracklist;
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover_big() {
        return cover_big;
    }

    public void setCover_big(String cover_big) {
        this.cover_big = cover_big;
    }

    public String getCover_medium() {
        return cover_medium;
    }

    public void setCover_medium(String cover_medium) {
        this.cover_medium = cover_medium;
    }

    public String getCover_small() {
        return cover_small;
    }

    public void setCover_small(String cover_small) {
        this.cover_small = cover_small;
    }

    public String getCover_xl() {
        return cover_xl;
    }

    public void setCover_xl(String cover_xl) {
        this.cover_xl = cover_xl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMd5_image() {
        return md5_image;
    }

    public void setMd5_image(String md5_image) {
        this.md5_image = md5_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
