package com.hf.hfhs.UI;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;


import com.google.gson.Gson;
import com.hf.hfhs.R;
import com.hf.hfhs.adapter.ClassifyAdapter;
import com.hf.hfhs.adapter.ClassifyMenuAdapter;
import com.hf.hfhs.bean.CategoryBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MallClassifyFragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private List<String> menuList = new ArrayList<>();
    private List<CategoryBean.DataBean> homeList = new ArrayList<>();
    private List<Integer> showTitle;
    private View view;
    private ListView lv_menu;
    private ListView lv_home;

    private ClassifyMenuAdapter classifyMenuAdapter;
    private ClassifyAdapter classifyAdapter;
    private int currentItem;

    //private TextView tv_title;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MallClassifyFragment() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_mall_classify, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        lv_menu = (ListView) view.findViewById(R.id.lv_menu);
        //tv_title = (TextView) rootView.findViewById(R.id.tv_title);
        lv_home = (ListView) view.findViewById(R.id.lv_home);
        classifyMenuAdapter = new ClassifyMenuAdapter(this.getActivity(), menuList);
        lv_menu.setAdapter(classifyMenuAdapter);
        classifyAdapter = new ClassifyAdapter(this.getActivity(), homeList);
        lv_home.setAdapter(classifyAdapter);
        classifyAdapter.setListener(new ClassifyAdapter.OnGridViewItemClickListener() {
            @Override
            public void onGridViewItemClickListener(CategoryBean.DataBean.DataListBean dataListBean) {
                //ToastUtil.showToast(getActivity(),dataListBean.getTitle());
                Bundle bundle = new Bundle();
                bundle.putString("title",dataListBean.getTitle());
//                gotoActivity(mContext, GoodsListActivity.class,bundle);
            }
        });
        lv_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                classifyMenuAdapter.setSelectItem(position);
                classifyMenuAdapter.notifyDataSetInvalidated();
                //tv_title.setText(menuList.get(position));
                lv_home.setSelection(showTitle.get(position));
            }
        });


        lv_home.setOnScrollListener(new AbsListView.OnScrollListener() {
            private int scrollState;

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                this.scrollState = scrollState;
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {
                if (scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE) {
                    return;
                }
                int current = showTitle.indexOf(firstVisibleItem);
//				lv_home.setSelection(current);
                if (currentItem != current && current >= 0) {
                    currentItem = current;
                    //tv_title.setText(menuList.get(currentItem));
                    classifyMenuAdapter.setSelectItem(currentItem);
                    classifyMenuAdapter.notifyDataSetInvalidated();
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        if(menuList == null || menuList.size() < 1) {
            loadData();
        }
    }

    private void loadData() {
        Gson gson = new Gson();
        String json = getJson(this.getActivity(), "category.json");
        CategoryBean categoryBean = gson.fromJson(json, CategoryBean.class);
        showTitle = new ArrayList<>();
        for (int i = 0; i < categoryBean.getData().size(); i++) {
            CategoryBean.DataBean dataBean = categoryBean.getData().get(i);
            menuList.add(dataBean.getModuleTitle());
            showTitle.add(i);
            homeList.add(dataBean);
        }
        //tv_title.setText(categoryBean.getData().get(0).getModuleTitle());

        classifyMenuAdapter.notifyDataSetChanged();
        classifyAdapter.notifyDataSetChanged();
    }



    /**
     * 得到json文件中的内容
     *
     * @param context
     * @param fileName
     * @return
     */
    public static String getJson(Context context, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        //获得assets资源管理器
        AssetManager assetManager = context.getAssets();
        //使用IO流读取json文件内容
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName), "utf-8"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

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
