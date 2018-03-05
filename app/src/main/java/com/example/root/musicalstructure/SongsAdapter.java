package com.example.root.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 29/12/17.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(@NonNull Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Songs songs = getItem(position);

        TextView songTextView = listView.findViewById(R.id.song_name);
        songTextView.setText(songs.getSongName());

        TextView albumTextView = listView.findViewById(R.id.album_name);
        albumTextView.setText(songs.getAlbumName());

        TextView artistTextView = listView.findViewById(R.id.artist_name);
        artistTextView.setText(songs.getArtistName());

        return listView;
    }
}
