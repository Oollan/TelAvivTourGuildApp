package com.example.oollan.telaviv_tourguildapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SweetsFragment extends Fragment {

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