package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;


public class qaza extends Fragment {
    ScrollView scrollView;
    TextView ghaza1, ghaza2, ghaza3, ghaza4, ghaza5, ghaza6;
     public static boolean fghaza0,fghaza1,fghaza2,fghaza3,fghaza4,fghaza5,fghaza6=false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_qaza, null);
        scrollView = rootView.findViewById(R.id.scrollghaza);
        ghaza1 = rootView.findViewById(R.id.ghaza1);
        ghaza2 = rootView.findViewById(R.id.ghaza2);
        ghaza3 = rootView.findViewById(R.id.ghaza3);
        ghaza4 = rootView.findViewById(R.id.ghaza4);
        ghaza5 = rootView.findViewById(R.id.ghaza5);
        ghaza6 = rootView.findViewById(R.id.ghaza6);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fghaza0) {
                    scrollView.scrollTo(0, 0);
                    fghaza0 = false;
                } else if (fghaza1) {
                    scrollView.scrollTo(0, ghaza1.getTop());
                    fghaza1 = false;
                } else if (fghaza2) {
                    scrollView.scrollTo(0, ghaza2.getTop());
                    fghaza2 = false;
                } else if (fghaza3) {
                    scrollView.scrollTo(0, ghaza3.getTop());
                    fghaza3 = false;
                } else if (fghaza4) {
                    scrollView.scrollTo(0, ghaza4.getTop());
                    fghaza4 = false;
                } else if (fghaza5) {
                    scrollView.scrollTo(0, ghaza5.getTop());
                    fghaza5 = false;
                } else if (fghaza6) {
                    scrollView.scrollTo(0, ghaza6.getTop());
                    fghaza6 = false;
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
                if (fghaza0) {
                    scrollView.scrollTo(0, 0);
                    fghaza0 = false;
                } else if (fghaza1) {
                    scrollView.scrollTo(0, ghaza1.getTop());
                    fghaza1 = false;
                } else if (fghaza2) {
                    scrollView.scrollTo(0, ghaza2.getTop());
                    fghaza2 = false;
                } else if (fghaza3) {
                    scrollView.scrollTo(0, ghaza3.getTop());
                    fghaza3 = false;
                } else if (fghaza4) {
                    scrollView.scrollTo(0, ghaza4.getTop());
                    fghaza4 = false;
                } else if (fghaza5) {
                    scrollView.scrollTo(0, ghaza5.getTop());
                    fghaza5 = false;
                } else if (fghaza6) {
                    scrollView.scrollTo(0, ghaza6.getTop());
                    fghaza6 = false;
                }
            }
        });
    }
}
