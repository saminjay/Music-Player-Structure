package com.example.root.musicalstructure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    CategoryAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new SongsFragment();
        else if (position == 1)
            return new AlbumsFragment();
        else
            return new ArtistsFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0)
            return "Songs";
        else if (position == 1)
            return "Albums";
        else
            return "Artists";
    }
}