package com.todocompany.taxidiscount;

import android.os.Bundle;

import com.todocompany.taxidiscount.fragments.ProfileFragment;
import com.todocompany.taxidiscount.fragments.SetPickupFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

public class MapsActivity extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle bundle) {

        disableLearningPattern();
        addAccount(new MaterialAccount(getResources(), "USER", "", R.mipmap.ic_launcher, null));
        addSection(newSection("HOME", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("MY ORDERS", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("SETTINGS", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("HELP", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("DRIVER APP", R.mipmap.ic_launcher, new SetPickupFragment()));
        addSection(newSection("profile todo remove", R.mipmap.ic_launcher, new ProfileFragment()));

        setSection(newSection("RIDE", R.mipmap.ic_launcher, new SetPickupFragment()));

    }

    @Override
    protected void onResume() {
        super.onResume();
        //     setUpMapIfNeeded();
    }


}
