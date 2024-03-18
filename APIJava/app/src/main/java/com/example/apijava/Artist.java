package com.example.apijava;

public class Artist {
    private int id;
    private String link;
    private String name;
    private String picture;
    private String picture_big;
    private String picture_medium;
    private String picture_small;
    private String picture_xl;
    private String tracklist;
    private String type;

    public Artist(int id, String link, String name, String picture, String picture_big, String picture_medium, String picture_small, String picture_xl, String tracklist, String type) {
        this.id = id;
        this.link = link;
        this.name = name;
        this.picture = picture;
        this.picture_big = picture_big;
        this.picture_medium = picture_medium;
        this.picture_small = picture_small;
        this.picture_xl = picture_xl;
        this.tracklist = tracklist;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture_big() {
        return picture_big;
    }

    public void setPicture_big(String picture_big) {
        this.picture_big = picture_big;
    }

    public String getPicture_medium() {
        return picture_medium;
    }

    public void setPicture_medium(String picture_medium) {
        this.picture_medium = picture_medium;
    }

    public String getPicture_small() {
        return picture_small;
    }

    public void setPicture_small(String picture_small) {
        this.picture_small = picture_small;
    }

    public String getPicture_xl() {
        return picture_xl;
    }

    public void setPicture_xl(String picture_xl) {
        this.picture_xl = picture_xl;
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
