package com.example.oollan.telaviv_tourguildapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.Adapters.PlaceAdapter;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class BaseFragment extends Fragment {

    private PlaceAdapter adapter = new PlaceAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager
                (getContext()));
        return rootView;
    }

    public void bindFragment(ArrayList<Place> places) {
        adapter.setPlaceAdapter(places);
    }
}
