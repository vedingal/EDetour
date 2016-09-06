package com.venndingal.edetour._Home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by keng on 06/09/16.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    Context _c;

    public SectionsPagerAdapter(FragmentManager fm, Context c) {

        super(fm);
        _c = c;
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if (position == 0){
            return new Frag1_Profile().newInstance(_c);
        }else if (position == 1){
            return new Frag2_Contacts().newInstance(_c);
        }else if (position == 2){
            return new Frag3_Maps().newInstance(_c);
        }else{
            return new Frag4_Rescue().newInstance(_c);
        }

    }
    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "";
            case 1:
                return "";
            case 2:
                return "";
            case 3:
                return "";
        }
        return null;
    }
}