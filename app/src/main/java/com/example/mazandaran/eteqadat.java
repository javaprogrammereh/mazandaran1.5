package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class eteqadat extends Fragment {
    ScrollView scrollView;
    TextView eteghad1, eteghad2, eteghad3;
    public static boolean feteghad1,feteghad2,feteghad3 = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_eteqadat, null);
        scrollView = rootView.findViewById(R.id.scrolleteghad);
        eteghad1 = rootView.findViewById(R.id.eteghad1);
        eteghad2 = rootView.findViewById(R.id.eteghad2);
        eteghad3 = rootView.findViewById(R.id.eteghad3);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (feteghad1) {
                    scrollView.scrollTo(0, eteghad1.getTop());
                    feteghad1 = false;
                } else if (feteghad2) {
                    scrollView.scrollTo(0, eteghad2.getTop());
                    feteghad2 = false;
                } else if (feteghad3) {
                    scrollView.scrollTo(0, eteghad3.getTop());
                    feteghad3 = false;
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
                if (feteghad1) {
                    scrollView.scrollTo(0, eteghad1.getTop());
                    feteghad1 = false;
                } else if (feteghad2) {
                    scrollView.scrollTo(0, eteghad2.getTop());
                    feteghad2 = false;
                } else if (feteghad3) {
                    scrollView.scrollTo(0, eteghad3.getTop());
                    feteghad3 = false;
                }
            }
        });
    }

}
