package com.tyba.sqapractice.jise.sp331;

public class Audiobook extends AudioTrack implements INavigation {
    private String author;
    private String narrator;

    public Audiobook(String title, int duration, String genre, String author, String narrator) {
        super(title, duration, genre);
        this.author = author;
        this.narrator = narrator;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public void play() {
        System.out.println("Playing audiobook: " + getTitle());
    }

    @Override
    public void pause() {
        System.out.println("Pausing audiobook: " + getTitle());
    }

    @Override
    public void forwardFifteenSeconds() {
        System.out.println("Forwarding audiobook: " + getTitle());
    }

    @Override
    public void backFifteenSeconds() {
        System.out.println("Backing audiobook: " + getTitle());
    }

    @Override
    public void jumpToTrack(int trackNumber) {
        System.out.println("Jumping to track: " + getTitle() + " " + trackNumber);
    }

    @Override
    public void changeSpeed(int speed) {
        System.out.println("Changing speed of audiobook: " + getTitle() + " to " + speed);
    }
}
