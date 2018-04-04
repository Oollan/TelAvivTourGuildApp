package com.example.oollan.telaviv_tourguildapp;

public class Place {

    private String placeName;
    private String placeLocation;
    private int imageResourceId;

    public Place(String placeName, String placeLocation) {
        this.placeName = placeName;
        this.placeLocation = placeLocation;
    }

    public Place(String placeName, String placeLocation, int imageResourceId) {
       this.placeName = placeName;
       this.placeLocation = placeLocation;
       this.imageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}