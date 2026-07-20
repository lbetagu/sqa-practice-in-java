package com.tyba.sqapractice.jise.sp331;

public class Podcast {
    private String title;
    private String host;
    private int duration;
    private String genre;

    public Podcast() {
    }

    public Podcast(String title, String host, int duration, String genre) {
        this.title = title;
        this.host = host;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

}
