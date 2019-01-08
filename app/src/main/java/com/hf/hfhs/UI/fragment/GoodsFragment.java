package com.hf.hfhs.UI.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hf.hfhs.R;
import com.hf.hfhs.bean.ProductShow;
import com.hf.hfhs.databinding.FragmentGoodsBinding;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;
import static com.hf.hfhs.Contants.PRODUCTTYPE;

import java.util.ArrayList;



public class GoodsFragment extends BaseFragment implements OnBannerListener {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public FragmentGoodsBinding mBinding;
    private String mParam1;
    private String mParam2;
    private String id;

    private OnFragmentInteractionListener mListener;

    public GoodsFragment() {

    }

    public static GoodsFragment newInstance(String param1, String param2) {
        GoodsFragment fragment = new GoodsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_goods, container, false);
        id = (String)getActivity().getIntent().getExtras().get("id");
        initView();
        initData();

        return mBinding.getRoot();
    }

    private void initData() {

    }

    private void initView() {
        initBannerNetView();
    }


    private void initBannerNetView() {

        mBinding.banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        mBinding.banner.setImageLoader(new MyLoader());
        mBinding.banner.setBannerAnimation(Transformer.Default);
        mBinding.banner.setDelayTime(5000);
        mBinding.banner.isAutoPlay(true);
        mBinding.banner.setIndicatorGravity(BannerConfig.CENTER);

        for(ProductShow goods : PRODUCTTYPE){
            if ((goods.getId() + "") .equals(id)){
                mBinding.banner.setBannerTitles(goods.getTitleList());
                mBinding.banner.setImages(goods.getImageList())
                        .setOnBannerListener(this)
                        .start();
            }
        }

    }

    /**
     * 轮播监听
     *
     * @param position
     */
    @Override
    public void OnBannerClick(int position) {
    }

    /**
     * 网络加载图片
     * 使用了Glide图片加载框架
     */
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context.getApplicationContext())
                    .load( path)
                    .into(imageView);
        }
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
