package com.tyba.sqapractice.jise.sp331;

public class Audiobook {
    private String title;
    private String author;
    private int duration;
    private String genre;
    private String narrator;

    public Audiobook() {
    }

    public Audiobook(String title, String author, int duration, String genre, String narrator) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.genre = genre;
        this.narrator = narrator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
