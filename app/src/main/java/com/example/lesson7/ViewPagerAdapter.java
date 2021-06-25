package com.example.lesson7;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    List<OnBoardingModel> list;

    public ViewPagerAdapter(@NonNull FragmentManager fm , List<OnBoardingModel> list) {
        super(fm);
        this.list = list;
    }

    @NonNull

    @Override
    public NewItameFragment getItem(int position) {
        return NewItameFragment.newInstance(list.get(position).getTitle() ,  list.get(position).getImage() , list.get(position).getDes());
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
