package com.example.oollan.telaviv_tourguildapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        PlaceAdapter adapter = new PlaceAdapter(placesList());
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager
                (getContext()));
        return rootView;
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