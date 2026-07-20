package com.tyba.sqapractice.jise.sp331;

import java.util.List;

public class Playlist {
    private String name;
    private String owner;
    private String description;
    private List<AudioTrack> tracks;

    public Playlist(String name, String owner, String description, List<AudioTrack> tracks) {
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AudioTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<AudioTrack> tracks) {
        this.tracks = tracks;
    }

    public void playAll() {
        for (AudioTrack track : tracks) {
            track.play();
        }
    }

    public void pauseAll() {
        for (AudioTrack track : tracks) {
            track.pause();
        }
    }

    public void addTrack(AudioTrack track) {
        tracks.add(track);
    }

    public void removeTrack(AudioTrack track) {
        tracks.remove(track);
    }

}
