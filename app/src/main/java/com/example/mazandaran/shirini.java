package com.example.mazandaran;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazandaran.adapter.AdapterSearch;

public class shirini extends Fragment {

    ScrollView scrollView;
    TextView shirini1, shirini2, shirini3, shirini4, shirini5, shirini6;
    public static boolean fshirini0,fshirini1,fshirini2,fshirini3,fshirini4,fshirini5,fshirini6=false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shirini, null);
        scrollView = rootView.findViewById(R.id.scrollshirini);
        shirini1 = rootView.findViewById(R.id.shirini1);
        shirini2 = rootView.findViewById(R.id.shirini2);
        shirini3 = rootView.findViewById(R.id.shirini3);
        shirini4 = rootView.findViewById(R.id.shirini4);
        shirini5 = rootView.findViewById(R.id.shirini5);
        shirini6 = rootView.findViewById(R.id.shirini6);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                if (fshirini0) {
                    scrollView.scrollTo(0, 0);
                    fshirini0 = false;
                } else if (fshirini1) {
                    scrollView.scrollTo(0, shirini1.getTop());
                    fshirini1 = false;
                } else if (fshirini2) {
                    scrollView.scrollTo(0, shirini2.getTop());
                    fshirini2 = false;
                } else if (fshirini3) {
                    scrollView.scrollTo(0, shirini3.getTop());
                    fshirini3 = false;
                } else if (fshirini4) {
                    scrollView.scrollTo(0, shirini4.getTop());
                    fshirini4 = false;
                } else if (fshirini5) {
                    scrollView.scrollTo(0, shirini5.getTop());
                    fshirini5 = false;
                } else if (fshirini6) {
                    scrollView.scrollTo(0, shirini6.getTop());
                    fshirini6 = false;
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
                if (fshirini0) {
                    scrollView.scrollTo(0, 0);
                    fshirini0 = false;
                } else if (fshirini1) {
                    scrollView.scrollTo(0, shirini1.getTop());
                    fshirini1 = false;
                } else if (fshirini2) {
                    scrollView.scrollTo(0, shirini2.getTop());
                    fshirini2 = false;
                } else if (fshirini3) {
                    scrollView.scrollTo(0, shirini3.getTop());
                    fshirini3 = false;
                } else if (fshirini4) {
                    scrollView.scrollTo(0, shirini4.getTop());
                    fshirini4 = false;
                } else if (fshirini5) {
                    scrollView.scrollTo(0, shirini5.getTop());
                    fshirini5 = false;
                } else if (fshirini6) {
                    scrollView.scrollTo(0, shirini6.getTop());
                    fshirini6 = false;
                }
            }
        });
    }
}
