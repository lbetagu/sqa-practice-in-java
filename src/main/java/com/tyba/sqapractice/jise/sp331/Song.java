package com.tyba.sqapractice.jise.sp331;

public class Song extends AudioTrack {

    private String artist;

    public Song(String title, int duration, String genre, String artist) {
        super(title, duration, genre);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println(
                "Playing song: " + getTitle() + " - " + getArtist() + " - Genre: " + getGenre() + " - Duration: "
                        + getDuration() + " seconds");
    }

    @Override
    public void pause() {
        System.out.println("Pausing song: " + getTitle());
    }

}
