package com.tyba.sqapractice.jise.sp331;

public class Song {
    private String name;
    private String artist;
    private int duration;
    private String genre;

    public Song() {
    }

    public Song(String name, String artist, int duration, String genre) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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
