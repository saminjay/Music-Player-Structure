package com.example.root.musicalstructure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class SongsFragment extends Fragment {

    public SongsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.songs_list, container, false);

        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));
        songs.add(new Songs("abc", "abc", "abc"));

        SongsAdapter songsAdapter = new SongsAdapter(getActivity(), songs);

        ListView listView = rootView.findViewById(R.id.lists);

        listView.setAdapter(songsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Play Current Song", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }


}
