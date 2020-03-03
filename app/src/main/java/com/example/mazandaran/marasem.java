package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class marasem extends Fragment {

    ScrollView scrollView;
    TextView marasem0, marasem1, marasem2, marasem3, marasem4, marasem5;
    public static boolean fmarasem0, fmarasem1, fmarasem2, fmarasem3, fmarasem4, fmarasem5, fmarasem6 =false;
    public marasem() {
        /*empty*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_marasem, null);
        scrollView = rootView.findViewById(R.id.scrollmarasem);
        marasem0 = rootView.findViewById(R.id.title0);
        marasem1 = rootView.findViewById(R.id.title1);
        marasem2 = rootView.findViewById(R.id.title2);
        marasem3 = rootView.findViewById(R.id.title3);
        marasem4 = rootView.findViewById(R.id.title4);
        marasem5 = rootView.findViewById(R.id.title5);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fmarasem6) {
                    scrollView.scrollTo(0, 0);
                    fmarasem6 = false;
                } else if (fmarasem0) {
                    scrollView.scrollTo(0, marasem0.getTop());
                    fmarasem0 = false;
                } else if (fmarasem1) {
                    scrollView.scrollTo(0, marasem1.getTop());
                    fmarasem1 = false;
                } else if (fmarasem2) {
                    scrollView.scrollTo(0, marasem2.getTop());
                    fmarasem2 = false;
                } else if (fmarasem3) {
                    scrollView.scrollTo(0, marasem3.getTop());
                    fmarasem3 = false;
                } else if (fmarasem4) {
                    scrollView.scrollTo(0, marasem4.getTop());
                    fmarasem4 = false;
                } else if (fmarasem5) {
                    scrollView.scrollTo(0, marasem5.getTop());
                    fmarasem5 = false;
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
                if (fmarasem6) {
                    scrollView.scrollTo(0, 0);
                    fmarasem6 = false;
                } else if (fmarasem0) {
                    scrollView.scrollTo(0, marasem0.getTop());
                    fmarasem0 = false;
                } else if (fmarasem1) {
                    scrollView.scrollTo(0, marasem1.getTop());
                    fmarasem1 = false;
                } else if (fmarasem2) {
                    scrollView.scrollTo(0, marasem2.getTop());
                    fmarasem2 = false;
                } else if (fmarasem3) {
                    scrollView.scrollTo(0, marasem3.getTop());
                    fmarasem3 = false;
                } else if (fmarasem4) {
                    scrollView.scrollTo(0, marasem4.getTop());
                    fmarasem4 = false;
                } else if (fmarasem5) {
                    scrollView.scrollTo(0, marasem5.getTop());
                    fmarasem5 = false;
                }
            }
        });
    }
}
