package com.example.oollan.telaviv_tourguildapp.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments.BarsFragment;
import com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments.OtherFragment;
import com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments.RestaurantsFragment;
import com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments.SweetsFragment;
import com.example.oollan.telaviv_tourguildapp.R;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;
    
    public CategoryAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
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
            return context.getString(R.string.restaurants);
        } else if (position == 1){
            return context.getString(R.string.bars);
        } else if (position == 2) {
            return context.getString(R.string.sweets);
        } else {
            return "Other";
        }
    }
}