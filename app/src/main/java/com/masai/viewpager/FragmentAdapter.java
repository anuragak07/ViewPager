package com.masai.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {


    public FragmentAdapter(@NonNull  FragmentManager fragmentManager,Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull

    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FragmentA();
                case 1:
                    return new FragmentB();
            case 2:
                return new FragmentC();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
