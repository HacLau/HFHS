package com.hf.hfhs.UI.activity;

import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import com.hf.hfhs.R;
import com.hf.hfhs.UI.fragment.DetailFragment;
import com.hf.hfhs.UI.fragment.GoodsFragment;
import com.hf.hfhs.databinding.ActivityGoodDetailBinding;
import java.util.ArrayList;
import java.util.List;
import static com.hf.hfhs.Contants.titles;


public class GoodsDetailActivity extends BaseActivity implements GoodsFragment.OnFragmentInteractionListener
        ,DetailFragment.OnFragmentInteractionListener
         {
    private ActivityGoodDetailBinding mBinding;
    private GoodsFragment goodsFragment;
    private DetailFragment detailFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_good_detail);
        initView();
    }

    private void initView() {

        if (goodsFragment == null) {
            goodsFragment = new GoodsFragment();
        }

        if (detailFragment == null) {
            detailFragment = new DetailFragment();
        }
        List<Fragment> list = new ArrayList<>();
        list.add(goodsFragment);
        list.add(detailFragment);

        mBinding.viewpager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),list));
        mBinding.tablayout.setupWithViewPager(mBinding.viewpager);
        mBinding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mBinding.tablayout));
        mBinding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //tab被选的时候回调
                mBinding.viewpager.setCurrentItem(tab.getPosition(), true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //tab未被选择的时候回调
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //tab重新选择的时候回调
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        List<Fragment> list = new ArrayList<>();
        public MyPagerAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
           // return null;
        }

        @Override
        public int getCount() {
            return titles.length;
        }

    }



}
