package com.todocompany.taxidiscount;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

import com.todocompany.taxidiscount.fragments.AddLocationFragment;
import com.todocompany.taxidiscount.fragments.HelpFragment;
import com.todocompany.taxidiscount.fragments.MyOrdersFragment;
import com.todocompany.taxidiscount.fragments.RegistrationFragment;
import com.todocompany.taxidiscount.fragments.RideFragment;
import com.todocompany.taxidiscount.fragments.SetPickupFragment;
import com.todocompany.taxidiscount.fragments.SettingsFragment;

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
        addSection(newSection("MY ORDERS", R.mipmap.my_order, new MyOrdersFragment()));
        addSection(newSection("SETTINGS", R.mipmap.settings, new SettingsFragment()));
        addSection(newSection("HELP", R.mipmap.help, new HelpFragment()));
        addSection(newSection("DRIVER APP", R.mipmap.driver_app, new SetPickupFragment()));


        // TODO remove ========================================
        addDivisor();
        addSection(newSection("ADD LOCATION", R.mipmap.ic_launcher, new AddLocationFragment()));
        addSection(newSection("RIDE", R.mipmap.ic_launcher, new RideFragment()));
        addSection(newSection("REGISTER", R.mipmap.ic_launcher, new RegistrationFragment()));


        //==========================================



    }

    @Override
    protected void onResume() {
        super.onResume();
        //     setUpMapIfNeeded();
    }


}
