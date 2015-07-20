package com.todocompany.taxidiscount.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.todocompany.taxidiscount.R;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

public class HelpFragment extends Fragment implements View.OnClickListener {

    MaterialNavigationDrawer drawerActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_help, null, false);
        drawerActivity = (MaterialNavigationDrawer) getActivity();

        Button btnTermsConditions, btnPrivacyPolicy, btnCallUs;
        btnTermsConditions = (Button) rootView.findViewById(R.id.btnTermsConditions);
        btnPrivacyPolicy = (Button) rootView.findViewById(R.id.btnPrivacyPolicy);
        btnCallUs = (Button) rootView.findViewById(R.id.btnCallUs);

        btnTermsConditions.setOnClickListener(this);
        btnPrivacyPolicy.setOnClickListener(this);
        btnCallUs.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTermsConditions:
                drawerActivity.setFragment(new TermsConditionsFragment(), "Terms & Conditions");
                break;
            case R.id.btnPrivacyPolicy:
                drawerActivity.setFragment(new PrivacyPolicyFragment(), "Privacy Policy");
                break;


        }
    }
}
