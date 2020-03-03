package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class akhlaqi extends Fragment {

    ScrollView scrollView;
    TextView  akhlag11, akhlag12, akhlag13, akhlag14 ;
    public static boolean fakhlagh1,fakhlagh2,fakhlagh3,fakhlagh4 = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_akhlaqi, null);
        scrollView = rootView.findViewById(R.id.scrollakhlagh);
        akhlag11 = rootView.findViewById(R.id.akhlagh1);
        akhlag12 = rootView.findViewById(R.id.akhlag2);
        akhlag13 = rootView.findViewById(R.id.akhlagh3);
        akhlag14 = rootView.findViewById(R.id.akhlag4);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fakhlagh1) {
                    scrollView.scrollTo(0, akhlag11.getTop());
                    fakhlagh1 = false;
                } else if (fakhlagh2) {
                    scrollView.scrollTo(0, akhlag12.getTop());
                    fakhlagh2 = false;
                } else if (fakhlagh3) {
                    scrollView.scrollTo(0, akhlag13.getTop());
                    fakhlagh3 = false;
                } else if (fakhlagh4) {
                    scrollView.scrollTo(0, akhlag14.getTop());
                    fakhlagh4 = false;
                }
            }
        });
        return rootView;
    }
    @Override
    public void onResume() {
        super.onResume();
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fakhlagh1) {
                    scrollView.scrollTo(0, akhlag11.getTop());
                    fakhlagh1 = false;
                } else if (fakhlagh2) {
                    scrollView.scrollTo(0, akhlag12.getTop());
                    fakhlagh2 = false;
                } else if (fakhlagh3) {
                    scrollView.scrollTo(0, akhlag13.getTop());
                    fakhlagh3 = false;
                } else if (fakhlagh4) {
                    scrollView.scrollTo(0, akhlag14.getTop());
                    fakhlagh4 = false;
                }
            }
        });
    }
}
