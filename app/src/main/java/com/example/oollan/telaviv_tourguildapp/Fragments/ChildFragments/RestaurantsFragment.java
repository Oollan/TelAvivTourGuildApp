package com.example.oollan.telaviv_tourguildapp.Fragments.ChildFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oollan.telaviv_tourguildapp.Fragments.BaseFragment;
import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class RestaurantsFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bindFragment(placesList());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private ArrayList<Place> placesList() {
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.susu), getString(R.string.susu_location),
                R.drawable.susu_and_sons));
        places.add(new Place(getString(R.string.taqueria), getString(R.string.taqueria_location),
                R.drawable.taqueria));
        places.add(new Place(getString(R.string.vitrina), getString(R.string.vitrina_location),
                R.drawable.vitrina_lili));
        places.add(new Place(getString(R.string.arale), getString(R.string.arale_location),
                R.drawable.arale_pizza));
        places.add(new Place(getString(R.string.port), getString(R.string.port_location),
                R.drawable.port_19));
        places.add(new Place(getString(R.string.dixie), getString(R.string.dixie_location),
                R.drawable.dixie));
        places.add(new Place(getString(R.string.miznon), getString(R.string.miznon_location),
                R.drawable.miznon));
        return places;
    }
}