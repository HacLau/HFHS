package com.hf.hfhs.UI;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hf.hfhs.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,MallClassifyFragment.OnFragmentInteractionListener {

    private ImageView mClassify_image;
    private TextView mClassify;
    private ImageView mMe_image;
    private TextView mMe;
    private LinearLayout mClassify_layout;
    private LinearLayout mMe_layout;
    private MallClassifyFragment mMallClassfragment;
    private MeFragment mMefragment;
    private int CLASSIFYFRAGMENT = 1;
    private int MEFRAGMENT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClick();
    }

    private void initView() {
        mClassify_layout = findViewById(R.id.main_ll_Classify);
        mClassify_image = findViewById(R.id.main_ic_Classify);
        mClassify = findViewById(R.id.main_tv_Classify);

        mMe_layout = findViewById(R.id.main_ll_Me);
        mMe_image = findViewById(R.id.main_ic_Me);
        mMe = findViewById(R.id.main_tv_Me);
    }

    private void InitFragment(int index) {
        //v4包下的Fragment，使用getSupportFragmentManager获取
        FragmentManager fragmentManager = getSupportFragmentManager();
        //启动事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //将所有的Fragment隐藏
        hideAllFragment(transaction);
        switch (index){
            case 1:
                if (mMallClassfragment == null){
                    mMallClassfragment = new MallClassifyFragment();
                    transaction.add(R.id.frame_content,mMallClassfragment);
                }else{
                    transaction.show(mMallClassfragment);
                }
                break;

            case 2:
                if (mMefragment == null){
                    mMefragment = new MeFragment();
                    transaction.add(R.id.frame_content,mMefragment);
                }else{
                    transaction.show(mMefragment);
                }

                break;

        }
        //提交事务
        transaction.commit();
    }

    private void initClick() {
        mClassify_layout.setOnClickListener(this);
        mMe_layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.main_ll_Classify:
                //点击分类相应的图文变化
                InitFragment(CLASSIFYFRAGMENT);
                mClassify_image.setImageResource(R.mipmap.classify_pre);
                mMe_image.setImageResource(R.mipmap.mine);
                mClassify.setTextColor(Color.parseColor("#3157F8"));
                mMe.setTextColor(Color.parseColor("#333333"));

                break;

            case R.id.main_ll_Me:
                InitFragment(MEFRAGMENT);
                mClassify_image.setImageResource(R.mipmap.classify);
                mMe_image.setImageResource(R.mipmap.mine_pre);

                mClassify.setTextColor(Color.parseColor("#333333"));
                mMe.setTextColor(Color.parseColor("#3157F8"));
                break;
        }

    }

    private void hideAllFragment(android.support.v4.app.FragmentTransaction transaction){
        if (mMallClassfragment != null){
            transaction.hide(mMallClassfragment);
        }

        if (mMefragment!= null){
            transaction.hide(mMefragment);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
