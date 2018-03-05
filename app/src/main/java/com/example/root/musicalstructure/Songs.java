package com.example.root.musicalstructure;

/**
 * Created by root on 29/12/17.
 */

public class Songs {
    private String songName;
    private String artistName;
    private String albumName;

    public Songs(String song, String artist, String album) {
        songName = song;
        albumName = album;
        artistName = artist;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }
}
