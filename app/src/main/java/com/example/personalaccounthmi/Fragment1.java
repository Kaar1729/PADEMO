package com.example.personalaccounthmi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Fragment1 extends Fragment {

    private ImageButton create;
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_allprofile, container , false);
        create = rootview.findViewById(R.id.create);

        // Inflate the layout for this fragment

    create.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openDialog();
        }
    });
        return rootview;
    }

    private void openDialog() {
        createDialog dialog = new createDialog();
        dialog.show(getFragmentManager(),"createDialog");
    }


}