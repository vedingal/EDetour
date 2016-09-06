package com.venndingal.edetour._Home;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.venndingal.edetour.R;
import com.venndingal.edetour._Home._Frag2_Contacts.ContactsAdapter;

public class Frag2_Contacts extends Fragment {

    Context c;
    public static String [] prgmNameList={"Callie Torres", "Christina Yang", "Jackson Avery", "Miranda Bailey", "Amelia Shepherd",
        "Alex Karev", "Owen Hunt", "Arizona Robbins", "April Kepner", "Mark Sloan"};





    public Frag2_Contacts() {
    }
    public Frag2_Contacts newInstance(Context c) {
        Frag2_Contacts fragment = new Frag2_Contacts();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        c = getActivity().getApplicationContext();
        View rootView = inflater.inflate(R.layout.frag2_contacts, container, false);

        ListView lv=(ListView) rootView.findViewById(R.id.lv_contacts);
        lv.setAdapter(new ContactsAdapter(c, prgmNameList));


        return rootView;
    }
}