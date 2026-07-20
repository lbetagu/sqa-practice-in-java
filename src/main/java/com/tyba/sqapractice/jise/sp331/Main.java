package com.tyba.sqapractice.jise.sp331;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create audio tracks
        AudioTrack song1 = new Song("Bohemian Rhapsody", 355, "Rock", "Queen");
        AudioTrack podcast1 = new Podcast("Los hombres sí lloran", 3600, "Interview", "Juan Pablo Raba");
        AudioTrack audiobook1 = new Audiobook("Como leer la biblia", 37000, "Religion", "Jorge Luis Borges",
                "Padre Alberto Linero");

        // Create a playlist
        List<AudioTrack> tracks = new ArrayList<>();
        tracks.add(song1);
        tracks.add(podcast1);
        tracks.add(audiobook1);
        Playlist playlist = new Playlist("My Playlist", "Jisela Londoño", "A collection of my favorite audio tracks",
                tracks);

        // Test playlist functionality
        System.out.println("Playlist: " + playlist.getName());
        System.out.println("Owner: " + playlist.getOwner());
        System.out.println("Description: " + playlist.getDescription());
        System.out.println("Tracks: " + playlist.getTracks().size());
        System.out.println("\n----Playing all tracks:----");
        playlist.playAll();
        System.out.println("\n----Pausing all tracks:----");
        playlist.pauseAll();
    }
}
