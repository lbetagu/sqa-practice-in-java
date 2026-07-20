package com.tyba.sqapractice.jise.sp331;

public class Podcast extends AudioTrack implements INavigation {
    private String host;

    public Podcast(String title, int duration, String genre, String host) {
        super(title, duration, genre);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + getTitle());
    }

    @Override
    public void pause() {
        System.out.println("Pausing podcast: " + getTitle());
    }

    @Override
    public void forwardFifteenSeconds() {
        System.out.println("Forwarding podcast: " + getTitle());
    }

    @Override
    public void backFifteenSeconds() {
        System.out.println("Backing podcast: " + getTitle());
    }

    @Override
    public void jumpToTrack(int trackNumber) {
        System.out.println("Jumping to track: " + getTitle() + " " + trackNumber);
    }

    @Override
    public void changeSpeed(int speed) {
        System.out.println("Changing speed of podcast: " + getTitle() + " to " + speed);
    }

}
