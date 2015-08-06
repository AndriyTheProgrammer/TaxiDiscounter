package com.todocompany.taxidiscount.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.todocompany.taxidiscount.R;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

/**
 * A simple {@link Fragment} subclass.
 */
public class CancelledRideFragment extends Fragment {


    public CancelledRideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MaterialNavigationDrawer) getActivity()).setTitle("RIDE");
        return inflater.inflate(R.layout.fragment_canceled_ride, container, false);
    }


}
