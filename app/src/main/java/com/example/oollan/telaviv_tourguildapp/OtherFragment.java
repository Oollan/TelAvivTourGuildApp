package com.example.oollan.telaviv_tourguildapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class OtherFragment extends Fragment {

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
        places.add(new Place("Dizengoff Center", "Dizengoff St 55"));
        places.add(new Place("Sarona Market", "Aluf Kalman Magen St 3"));
        places.add(new Place("Azrieli Mall", "Derech Menachem Begin 132"));
        return places;
    }
}