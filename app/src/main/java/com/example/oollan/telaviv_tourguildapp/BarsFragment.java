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