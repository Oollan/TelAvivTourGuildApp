package com.example.oollan.telaviv_tourguildapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oollan.telaviv_tourguildapp.Place;
import com.example.oollan.telaviv_tourguildapp.R;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private ArrayList<Place> places;

    public void setPlaceAdapter(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PlaceViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, int position) {
        holder.placeTV.setText(places.get(position).getPlaceName());
        holder.locationTV.setText(places.get(position).getPlaceLocation());
        holder.imageTV.setImageResource(places.get(position).getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder {

        private TextView placeTV;
        private TextView locationTV;
        private ImageView imageTV;

        PlaceViewHolder(View recyclerItem) {
            super(recyclerItem);
            placeTV = recyclerItem.findViewById(R.id.placeTV);
            locationTV = recyclerItem.findViewById(R.id.locationTV);
            imageTV = recyclerItem.findViewById(R.id.imageTV);
        }
    }
}