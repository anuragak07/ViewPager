package com.masai.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setViewPagerAdapter();

    }

    private void initViews() {
        tabLayout =findViewById(R.id.tabLayout);
        viewPager2=findViewById(R.id.viewPager2);
    }

    private void setViewPagerAdapter() {
        FragmentAdapter pagerAdapter = new FragmentAdapter(getSupportFragmentManager(),getLifecycle());

        viewPager2.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {
                tab.setText("Fragment - "+ position);
            }
        }).attach();

    }
    public  void setData(String name){
        this.name =name;
    }

    public String getData() {
        return name;
    }
}