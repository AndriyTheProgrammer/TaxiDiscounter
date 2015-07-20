package com.todocompany.taxidiscount.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.todocompany.taxidiscount.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrdersFragment extends Fragment {

    RadioButton btnInProgress, btnCompleted;
    LinearLayout in_progress_container, completed_container;

    public MyOrdersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_orders, container, false);
        btnInProgress = (RadioButton) rootView.findViewById(R.id.btn_in_progress);
        btnCompleted = (RadioButton) rootView.findViewById(R.id.btn_completed);
        in_progress_container = (LinearLayout) rootView.findViewById(R.id.in_progress_container);
        completed_container = (LinearLayout) rootView.findViewById(R.id.completed_container);
        btnInProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in_progress_container.setVisibility(View.VISIBLE);
                completed_container.setVisibility(View.GONE);
            }
        });
        btnCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in_progress_container.setVisibility(View.GONE);
                completed_container.setVisibility(View.VISIBLE);
            }
        });
        return rootView;
    }


}
