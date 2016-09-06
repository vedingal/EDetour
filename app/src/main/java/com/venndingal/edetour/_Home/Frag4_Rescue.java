package com.venndingal.edetour._Home;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.venndingal.edetour.R;

public class Frag4_Rescue extends Fragment {

    Context c;

    public Frag4_Rescue() {
    }

    public Frag4_Rescue newInstance(Context c) {
        Frag4_Rescue fragment = new Frag4_Rescue();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        c = getActivity().getApplicationContext();
        View rootView = inflater.inflate(R.layout.frag4_rescue, container, false);
        return rootView;
    }
}