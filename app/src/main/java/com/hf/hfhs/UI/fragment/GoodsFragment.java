package com.hf.hfhs.UI.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hf.hfhs.R;
import com.hf.hfhs.databinding.FragmentGoodsBinding;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;



public class GoodsFragment extends BaseFragment implements OnBannerListener {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public FragmentGoodsBinding mBinding;
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ArrayList<Integer> list_path = new ArrayList<>();
    private ArrayList<String> list_title = new ArrayList<>();

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
        initView();
        initData();
        return mBinding.getRoot();
    }

    private void initData() {

    }

    private void initView() {
        list_title.add("很多东西，不是我要，就能得到,很多人，不是我留，就能留住。");
        list_title.add("你就像指缝的阳光，温暖，美好，却永远无法抓住，我行走在爱的荒漠，迷失了方向。");
        list_title.add("沿途的风景，只能边走边忘。不再挣扎，不再纠缠。时光如水，总是无言。");
        list_title.add("我觉得人与人都是缘分，缘分一旦完了，再怎么强求都是无济于事的，那只会让别人觉得是个笑话。");

        list_path.add(R.mipmap.banner1);
        list_path.add(R.mipmap.banner2);
        list_path.add(R.mipmap.banner3);
        list_path.add(R.mipmap.banner4);

        initBannerNetView();
    }


    private void initBannerNetView() {

        mBinding.banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        mBinding.banner.setImageLoader(new MyLoader());
        mBinding.banner.setBannerAnimation(Transformer.Default);
        mBinding.banner.setBannerTitles(list_title);
        mBinding.banner.setDelayTime(5000);
        mBinding.banner.isAutoPlay(true);
        mBinding.banner.setIndicatorGravity(BannerConfig.CENTER);
        mBinding.banner.setImages(list_path)
                .setOnBannerListener(this)
                .start();
    }

    /**
     * 轮播监听
     *
     * @param position
     */
    @Override
    public void OnBannerClick(int position) {
        if (list_title.size() != 0) {

        }else{
            Toast.makeText(getActivity(), "网络错误，请稍后重试", Toast.LENGTH_SHORT).show();
        }
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
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
