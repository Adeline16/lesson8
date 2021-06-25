package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on);
        viewPager = findViewById(R.id.view_pager);
        List<OnBoardingModel> list = new ArrayList<>();
        list.add(new OnBoardingModel("Title 1" , "Description 1" , R.drawable.ic_launcher_firstscreen));
        list.add(new OnBoardingModel("Title 2" , "Description 2" , R.drawable.ic_launcher_secondscreen));
        list.add(new OnBoardingModel("Title 3" , "Description 3" , R.drawable.ic_launcher_third));
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(viewPagerAdapter);
    }
}