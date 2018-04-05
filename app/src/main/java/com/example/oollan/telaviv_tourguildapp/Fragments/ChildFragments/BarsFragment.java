package com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oollan.telaviv_tourguildapp.Fragments.BaseFragment;
import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class BarsFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bindFragment(placesList());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private ArrayList<Place> placesList() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.ibni), getString(R.string.ibni_location),
                R.drawable.ibni));
        places.add(new Place(getString(R.string.beer_shop), getString(R.string.beer_shop_location),
                R.drawable.beer_shop));
        places.add(new Place(getString(R.string.louis), getString(R.string.louis_location),
                R.drawable.louis));
        places.add(new Place(getString(R.string.rutina), getString(R.string.rutina_location),
                R.drawable.rutina));
        places.add(new Place(getString(R.string.yavne), getString(R.string.yavne_location),
                R.drawable.yavne));
        places.add(new Place(getString(R.string.bazaar), getString(R.string.bazaar_location),
                R.drawable.beerbazaar));
        places.add(new Place(getString(R.string.teder), getString(R.string.teder_location),
                R.drawable.teder));
        return places;
    }
}