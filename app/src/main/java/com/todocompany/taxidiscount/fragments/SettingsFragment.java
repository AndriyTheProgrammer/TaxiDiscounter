package com.todocompany.taxidiscount.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.todocompany.taxidiscount.R;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    MaterialNavigationDrawer drawerActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_settings, null, false);
        drawerActivity = (MaterialNavigationDrawer) getActivity();


        Button btnProfile = (Button) rootView.findViewById(R.id.btnProfile);

        btnProfile.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProfile:
                drawerActivity.setFragment(new ProfileFragment(), "Profile");
                break;


        }
    }
}
