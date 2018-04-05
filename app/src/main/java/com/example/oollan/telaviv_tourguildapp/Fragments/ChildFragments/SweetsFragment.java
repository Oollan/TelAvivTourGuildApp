package com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oollan.telaviv_tourguildapp.Fragments.BaseFragment;
import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class SweetsFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bindFragment(placesList());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private ArrayList<Place> placesList() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.otello), getString(R.string.otello_location),
                R.drawable.otello));
        places.add(new Place(getString(R.string.churrosia), getString(R.string.churrosia_location),
                R.drawable.hachurrosia));
        places.add(new Place(getString(R.string.cookeez), getString(R.string.cookeez_location),
                R.drawable.cookeez));
        places.add(new Place(getString(R.string.tamara), getString(R.string.tamara_location),
                R.drawable.tamara));
        places.add(new Place(getString(R.string.malabiya), getString(R.string.malabiya_location),
                R.drawable.hamalabiya));
        places.add(new Place(getString(R.string.shakeout), getString(R.string.shakeout_location),
                R.drawable.shakeout));
        return places;
    }
}