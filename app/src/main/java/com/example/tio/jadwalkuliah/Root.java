package com.example.tio.jadwalkuliah;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Root extends Fragment {

    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.root, container, false);

        getActivity().setTitle("TAM Nav Drawer");

        return rootView;
    }
}