package com.example.myapplication;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;

public interface OnMapReadyCallback {
    void onMapReady(@NonNull GoogleMap googleMap);
}
