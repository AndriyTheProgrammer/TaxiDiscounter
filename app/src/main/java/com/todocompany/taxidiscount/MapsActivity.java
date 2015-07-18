package com.todocompany.taxidiscount;

import android.os.Bundle;

import com.todocompany.taxidiscount.fragments.AddLocationFragment;
import com.todocompany.taxidiscount.fragments.ProfileFragment;
import com.todocompany.taxidiscount.fragments.SetPickupFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

public class MapsActivity extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle bundle) {

        getToolbar().setTitleTextColor(getResources().getColor(R.color.base_yellow));


        disableLearningPattern();
        addAccount(new MaterialAccount(getResources(), "USER", "", R.mipmap.ic_launcher, null));
        addSection(newSection("HOME", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("MY ORDERS", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("SETTINGS", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("HELP", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("DRIVER APP", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("profile todo remove", R.mipmap.ic_launcher, new ProfileFragment()));
        addSection(newSection("add location todo remove", R.mipmap.ic_launcher, new AddLocationFragment()));

        setSection(newSection("RIDE", R.mipmap.ic_launcher, new SetPickupFragment()));

    }

    @Override
    protected void onResume() {
        super.onResume();
        //     setUpMapIfNeeded();
    }


}
