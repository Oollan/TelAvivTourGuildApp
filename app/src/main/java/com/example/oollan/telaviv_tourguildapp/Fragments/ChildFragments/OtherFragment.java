package com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oollan.telaviv_tourguildapp.Fragments.BaseFragment;
import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class OtherFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bindFragment(placesList());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private ArrayList<Place> placesList() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.center), getString(R.string.center_location)));
        places.add(new Place(getString(R.string.market), getString(R.string.market_location)));
        places.add(new Place(getString(R.string.mall), getString(R.string.mall_location)));
        return places;
    }
}