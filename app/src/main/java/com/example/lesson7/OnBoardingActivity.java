package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TextView txtSkip, txtNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on);
        txtNext = findViewById(R.id.txt_next);
        txtSkip = findViewById(R.id.txt_skip);
        viewPager = findViewById(R.id.view_pager);
        List<OnBoardingModel> list = new ArrayList<>();
        list.add(new OnBoardingModel("Добро пожаловать!" , "В Китаефандоме Вас ждет:" , R.drawable.welcome));
        list.add(new OnBoardingModel("Первое:" , "Культивирование" , R.drawable.firstscreen));
        list.add(new OnBoardingModel("Второе:" , "Бессонные ночи" , R.drawable.secondscreen));
        list.add(new OnBoardingModel("Третье:" , "Р-романтика" , R.drawable.thirsscreen));
        list.add(new OnBoardingModel("И многое другое" , "Приятного прочтения!", R.drawable.welcome2));
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(viewPagerAdapter);

        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = viewPager.getCurrentItem();
                if (pos < list.size() - 1){
                    pos++;
                    viewPager.setCurrentItem(pos);
                } else {
                    Intent intent = new Intent(OnBoardingActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoardingActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public class SharedPreferencesExample extends Activity {
        private static final String MY_SETTINGS = "my_settings";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                    Context.MODE_PRIVATE);
            boolean hasVisited = sp.getBoolean("hasVisited", false);
            if (!hasVisited) {
                SharedPreferences.Editor e = sp.edit();
                e.putBoolean("hasVisited", true);
                e.commit();
            }
        }
    }
}