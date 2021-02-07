package com.example.quizpeak_interfaz;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.quizpeak_interfaz.ui.slideshow.SignupTabFragment;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem (int position){
        switch (position){
            case 0:
                LoginTabFrament loginTabFrament = new LoginTabFrament();
                return loginTabFrament;
            case 1:
                SignupTabFragment signupTabFragment = new SignupTabFragment();
                return  signupTabFragment;
            default:
                return null;
        }
    }

}
