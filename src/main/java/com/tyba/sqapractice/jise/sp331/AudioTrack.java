package com.tyba.sqapractice.jise.sp331;

public abstract class AudioTrack {

    private String title;
    private int duration;
    private String genre;

    protected AudioTrack(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public abstract void play();

    public abstract void pause();

}
