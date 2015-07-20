package com.todocompany.taxidiscount.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.todocompany.taxidiscount.R;


// TODO REMOVE THIS FRAGMENT ON PRODUCTION. USED ONLY TO SHOW ITEMS FROM LISTS
public class TodoRemoveThisFragment extends Fragment {


    public TodoRemoveThisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo_remove_this, container, false);
    }


}
