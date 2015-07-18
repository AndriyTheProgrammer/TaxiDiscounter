package com.todocompany.taxidiscount.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.todocompany.taxidiscount.R;

public class RideFragment extends Fragment {

    private static final int STREET_VIEW_ACCURACY = 100;
    LatLng markerPosition = new LatLng(49.840550, 24.028200);
    RadioButton btnMapView, btnStreetView;
    FrameLayout mapsContainer;
    View rootView;
    String pickup, destination, details;
    private MapView mapView;
    private StreetViewPanoramaView streetView;
    private GoogleMap googleMap;
    private StreetViewPanorama streetPanorama;

    public RideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_set_pickup, container, false);
        btnMapView = (RadioButton) rootView.findViewById(R.id.btn_map_view);
        btnStreetView = (RadioButton) rootView.findViewById(R.id.btn_street_view);
        mapsContainer = (FrameLayout) rootView.findViewById(R.id.mapsContainer);
        streetView = (StreetViewPanoramaView) rootView.findViewById(R.id.streetView);
        mapView = (MapView) rootView.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        streetView.onCreate(savedInstanceState);
        enableStreetView(false);


        btnMapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableStreetView(false);
            }
        });
        btnStreetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableStreetView(true);
            }
        });

        setUpMapIfNeeded();


        return rootView;
    }


    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
        streetView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
        streetView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
        streetView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
        streetView.onLowMemory();
    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mapView == null) {
            mapView = (MapView) rootView.findViewById(R.id.mapView);
            googleMap = mapView.getMap();
            if (mapView != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        googleMap.addMarker(new MarkerOptions().position(markerPosition).title("L'viv"));
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                markerPosition = latLng;
                /**
                 * Ensure the street view has been initialised correctly and
                 * pass it through the selected lat/long co-ordinates.
                 */
                if (streetView != null) {
                    enableStreetView(true);
                }
            }
        });
    }

    private void enableStreetView(boolean isEnabled) {
        if (streetPanorama == null) {
            streetView = (StreetViewPanoramaView) rootView.findViewById(R.id.streetView);
            streetPanorama = streetView.getStreetViewPanorama();
        }
        if (isEnabled & markerPosition != null) {
            btnStreetView.setChecked(true);
            btnMapView.setChecked(false);
            streetPanorama.setPosition(markerPosition, STREET_VIEW_ACCURACY);
            mapView.setVisibility(View.INVISIBLE);
            streetView.setVisibility(View.VISIBLE);
        } else {
            btnMapView.setChecked(true);
            btnStreetView.setChecked(false);
            mapView.setVisibility(View.VISIBLE);
            streetView.setVisibility(View.INVISIBLE);
        }

    }


}
