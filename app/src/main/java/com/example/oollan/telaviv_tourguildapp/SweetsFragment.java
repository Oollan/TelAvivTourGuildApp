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
        places.add(new Place("Otello", "Dizengoff St 165",
                R.drawable.otello));
        places.add(new Place("Hachurrosia", "Ibn Gabirol Street 17",
                R.drawable.hachurrosia));
        places.add(new Place("Cookeez", "Dizengoff St 116",
                R.drawable.cookeez));
        places.add(new Place("Tamara Rothschild", "Rothschild Blvd 19",
                R.drawable.tamara));
        places.add(new Place("Hamalabiya", "Gedera St 28",
                R.drawable.hamalabiya));
        places.add(new Place("Shakeout Dizengoff", "Dizengoff St 95",
                R.drawable.shakeout));
        return places;
    }
}