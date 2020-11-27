package com.techroof.tipsoul.Adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.techroof.tipsoul.Services.GlobalServices;
import com.techroof.tipsoul.Services.LocalServices;


public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LocalServices local = new LocalServices();
                return local;
            case 1:
                GlobalServices global = new GlobalServices();
                return global;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 2; // 2 is total fragment number (e.x- Chats, Requests)
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Local"; // local services
            case 1:
                return "Global"; // global services
            default:
                return null;
        }
        //return super.getPageTitle(position);
    }
}
