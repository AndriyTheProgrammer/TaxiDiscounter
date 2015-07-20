package com.todocompany.taxidiscount.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.todocompany.taxidiscount.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnTheWayFragment extends Fragment {

    MapView mapView;
    GoogleMap googleMap;

    public OnTheWayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_on_the_way, container, false);
        mapView = (MapView) rootView.findViewById(R.id.mapOnTheWay);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap gMap) {
                googleMap = gMap;
                googleMap.addMarker(new MarkerOptions().position(new LatLng(49.840550, 24.028200)).title("L'viv"));

            }
        });
        mapView.onCreate(savedInstanceState);


        return rootView;
    }


    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }


}
