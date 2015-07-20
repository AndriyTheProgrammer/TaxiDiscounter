package com.todocompany.taxidiscount;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

import com.todocompany.taxidiscount.fragments.AddLocationFragment;
import com.todocompany.taxidiscount.fragments.HelpFragment;
import com.todocompany.taxidiscount.fragments.ProfileFragment;
import com.todocompany.taxidiscount.fragments.RegistrationFragment;
import com.todocompany.taxidiscount.fragments.RideFragment;
import com.todocompany.taxidiscount.fragments.SetPickupFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

public class MapsActivity extends MaterialNavigationDrawer {

    TextView tvInfo;

    @Override
    public void init(Bundle bundle) {

        getToolbar().setTitleTextColor(getResources().getColor(R.color.base_yellow));

        tvInfo = new TextView(this);
        tvInfo.setGravity(Gravity.END);
        tvInfo.setText("Test text 4545");
        tvInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        getToolbar().addView(tvInfo);

        disableLearningPattern();
        addAccount(new MaterialAccount(getResources(), "USER", "", R.mipmap.my_photo_default, null));
        addSection(newSection("HOME", R.mipmap.home, new SetPickupFragment()));
        addSection(newSection("MY ORDERS", R.mipmap.my_order, new SetPickupFragment()));
        addSection(newSection("SETTINGS", R.mipmap.settings, new SetPickupFragment()));
        addSection(newSection("HELP", R.mipmap.help, new HelpFragment()));
        addSection(newSection("DRIVER APP", R.mipmap.driver_app, new SetPickupFragment()));


        // TODO remove ========================================
        addSection(newSection("profile", R.mipmap.ic_launcher, new ProfileFragment()));
        addSection(newSection("add location", R.mipmap.ic_launcher, new AddLocationFragment()));
        addSection(newSection("register", R.mipmap.ic_launcher, new RegistrationFragment()));


        //==========================================

        setSection(newSection("RIDE", R.mipmap.ic_launcher, new RideFragment()));


    }

    @Override
    protected void onResume() {
        super.onResume();
        //     setUpMapIfNeeded();
    }


}
