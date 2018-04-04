package com.example.oollan.telaviv_tourguildapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new BarsFragment();
        } else if (position == 2) {
            return new SweetsFragment();
        } else {
            return new OtherFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Restaurants";
        } else if (position == 1){
            return "Bars";
        } else if (position == 2) {
            return "Sweets";
        } else {
            return "Other";
        }
    }
}