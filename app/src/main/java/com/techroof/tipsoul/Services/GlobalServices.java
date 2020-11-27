package com.techroof.tipsoul.Services;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techroof.tipsoul.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GlobalServices} factory method to
 * create an instance of this fragment.
 */
public class GlobalServices extends Fragment {

    public GlobalServices() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_global_services, container, false);
    }
}