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
        places.add(new Place("Susu And Sons Dizengoff", "Dizengoff St 166",
                R.drawable.susu_and_sons));
        places.add(new Place("Taqueria", "Levontin St 28",
                R.drawable.taqueria));
        places.add(new Place("Vitrina Lili", "Lilienblum St 40",
                R.drawable.vitrina_lili));
        places.add(new Place("Arale Pizza", "Dizengoff St 123",
                R.drawable.arale_pizza));
        places.add(new Place("Port 19", "Shlomo ha-Melekh St 2",
                R.drawable.port_19));
        places.add(new Place("Dixie", "Yigal Alon St 120",
                R.drawable.dixie));
        places.add(new Place("Miznon King George", "King George St 30",
                R.drawable.miznon));
        return places;
    }
}