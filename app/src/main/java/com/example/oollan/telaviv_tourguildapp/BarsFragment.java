package com.example.oollan.telaviv_tourguildapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BarsFragment extends Fragment {

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
        places.add(new Place("Ibni", "Arlozorov St 8",
                R.drawable.ibni));
        places.add(new Place("Beer Shop", "Yehuda ha-Levi St 21",
                R.drawable.beer_shop));
        places.add(new Place("Louis", "Malkhei Yisra'el St 4",
                R.drawable.louis));
        places.add(new Place("Rutina", "Frishman St 41",
                R.drawable.rutina));
        places.add(new Place("Yavne", "Yavne St 31",
                R.drawable.yavne));
        places.add(new Place("BeerBazaar Habima", "Rothschild Blvd 142",
                R.drawable.beerbazaar));
        places.add(new Place("Teder.fm", "Derech Jaffa 9",
                R.drawable.teder));
        return places;
    }
}