package com.popfun.sgsg.sgsg_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.beardedhen.androidbootstrap.BootstrapButton;


/**
 * Created by LIM_YUNGYOO on 2015-07-04.
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener{
    // Max Pager Num
    private int pagers_num = 2;

    // Fragment numbering
    public final static int fragment_pager1 = 0;
    public final static int fragment_pager2 = 1;

    ViewPager mViewPager;

    BootstrapButton btn_main_individual_pager, btn_main_studygroup_pager;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mViewPager = (ViewPager) findViewById(R.id.main_pager);
        mViewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        mViewPager.setCurrentItem(fragment_pager1);


        btn_main_individual_pager = (BootstrapButton)findViewById(R.id.btn_main_individual);
        btn_main_studygroup_pager = (BootstrapButton)findViewById(R.id.btn_main_studygroup);

        btn_main_individual_pager.setOnClickListener(this);
        btn_main_studygroup_pager.setOnClickListener(this);





    }




    //Fragment Pager Adapter innerClass

    private class PagerAdapter extends FragmentPagerAdapter{
        public  PagerAdapter(android.support.v4.app.FragmentManager fragment){
            super(fragment);
        }

        @Override
        public Fragment getItem(int position){
            switch (position){
                case fragment_pager1:
                    return  new IndividualActivity();
                case fragment_pager2:
                    return  new StudyGroupActivity();
                default:
                    return null;

            }
        }

        @Override
        public int getCount(){
            return pagers_num;
        }


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_main_individual:
                mViewPager.setCurrentItem(fragment_pager1);
                break;
            case R.id.btn_main_studygroup:
                mViewPager.setCurrentItem(fragment_pager2);
                break;
        }
    }




}



