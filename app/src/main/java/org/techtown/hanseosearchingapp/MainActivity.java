package org.techtown.hanseosearchingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.techtown.hanseosearchingapp.fragment.FirstFragment;
import org.techtown.hanseosearchingapp.fragment.HomeFragment;
import org.techtown.hanseosearchingapp.fragment.SecondFragment;
import org.techtown.hanseosearchingapp.fragment.ThirdFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 mViewPager;
    private TabLayout tabLayout;

    private HomeFragment homeFragment;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;

    private String[] titles = new String[]{"홈","학교&버스", "태안음식", "기타정보"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager 설정
        mViewPager = findViewById(R.id.view_pager);
        mViewPager.setOffscreenPageLimit(4);//페이지 유지 개수


        //tabLayout에 ViewPager 연결
        tabLayout =findViewById(R.id.tab_layout);

        //Fragment 생성
        homeFragment = new HomeFragment();
        firstFragment =new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        //ViewPagerAdapter를 이용하여 Fragment 연결
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPagerAdapter.addFragment(homeFragment);
        viewPagerAdapter.addFragment(firstFragment);
        viewPagerAdapter.addFragment(secondFragment);
        viewPagerAdapter.addFragment(thirdFragment);
        mViewPager.setAdapter(viewPagerAdapter);

        //displaying tabs
        new TabLayoutMediator(tabLayout, mViewPager, (tab, position) -> tab.setText(titles[position])).attach();

        //tabLayout에 아이콘 설정 부분
        ArrayList<Integer> image = new ArrayList<>();
        image.add(R.drawable.icon_1);
        image.add(R.drawable.icon_home);
        image.add(R.drawable.icon_2);
        image.add(R.drawable.icon_3);

        for (int i = 0; i < 4; i++)
        {
            tabLayout.getTabAt(i).setIcon(image.get(i));
        }

        /*
        //세번째 화면에 Badge 달기
        BadgeDrawable badgeDrawable = tabLayout.getTabAt(2).getOrCreateBadge();
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(7);
         */
    }

    ///// 어플리케이션에서 '상태바'와 '네비게이션 바'의 색상 변경 /////
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            applyColors();
        }
    }

    // Apply the title/navigation bar color
    private void applyColors() {
        getWindow().setStatusBarColor(Color.parseColor("#ace0f9")); // 하늘색
       // getWindow().setNavigationBarColor(Color.parseColor("#c2e9fb"));
    }
}