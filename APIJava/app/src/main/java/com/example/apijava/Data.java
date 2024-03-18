package com.example.apijava;

public class Data {
    private Album album;
    private Artist artist;
    private int duration;
    private int explicit_content_cover;
    private int explicit_content_lyrics;
    private boolean explicit_lyrics;
    private long id;
    private String link;
    private String md5_image;
    private String preview;
    private int rank;
    private boolean readable;
    private String title;
    private String title_short;
    private String title_version;
    private String type;

    public Data(Album album, Artist artist, int duration, int explicit_content_cover, int explicit_content_lyrics, boolean explicit_lyrics, long id, String link, String md5_image, String preview, int rank, boolean readable, String title, String title_short, String title_version, String type) {
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.explicit_content_cover = explicit_content_cover;
        this.explicit_content_lyrics = explicit_content_lyrics;
        this.explicit_lyrics = explicit_lyrics;
        this.id = id;
        this.link = link;
        this.md5_image = md5_image;
        this.preview = preview;
        this.rank = rank;
        this.readable = readable;
        this.title = title;
        this.title_short = title_short;
        this.title_version = title_version;
        this.type = type;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getExplicit_content_cover() {
        return explicit_content_cover;
    }

    public void setExplicit_content_cover(int explicit_content_cover) {
        this.explicit_content_cover = explicit_content_cover;
    }

    public int getExplicit_content_lyrics() {
        return explicit_content_lyrics;
    }

    public void setExplicit_content_lyrics(int explicit_content_lyrics) {
        this.explicit_content_lyrics = explicit_content_lyrics;
    }

    public void setExplicit_lyrics(boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMd5_image() {
        return md5_image;
    }

    public void setMd5_image(String md5_image) {
        this.md5_image = md5_image;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short() {
        return title_short;
    }

    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    public String getTitle_version() {
        return title_version;
    }

    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
