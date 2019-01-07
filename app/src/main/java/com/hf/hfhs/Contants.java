package com.hf.hfhs;

import com.hf.hfhs.bean.CartListBeanModel;
import com.hf.hfhs.bean.GoodsIs;
import com.hf.hfhs.bean.GoodsListBeanModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/13.
 */

public class Contants {

    public static List<GoodsListBeanModel> goodsList = new ArrayList<GoodsListBeanModel>() {
        {
            add(new GoodsListBeanModel(1, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(2, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(3, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(4, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(5, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
            add(new GoodsListBeanModel(6, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "38098", ""));
        }
    };

    public static List<CartListBeanModel> cartList = new ArrayList<CartListBeanModel>() {
        {
            add(new CartListBeanModel(1, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "5",1, ""));
            add(new CartListBeanModel(2, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "600", 1,""));
            add(new CartListBeanModel(3, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "70",1, ""));
            add(new CartListBeanModel(4, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "800", 1,""));
            add(new CartListBeanModel(5, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "9", 1,""));
            add(new CartListBeanModel(6, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "100",1, ""));
            add(new CartListBeanModel(7, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "40", 1,""));
            add(new CartListBeanModel(8, "", "魅可（M.A.C）口红mac头女士唇膏3g Sweet sakura 甜蜜樱花（润泽）", "3000",1, ""));
        }
    };
    public final static String[] titles = {"商品", "详情"};


    public static List<Integer> NF_8 = new ArrayList<Integer>(){
        {
            add(R.mipmap.banner1);
            add(R.mipmap.banner2);
            add(R.mipmap.banner3);
            add(R.mipmap.banner4);
        }

    };

    public static List<GoodsIs> NF_1 = new ArrayList<GoodsIs>(){
        {
            add(new GoodsIs(1, new ArrayList<Integer>() {{
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
            }}));

            add(new GoodsIs(2, new ArrayList<Integer>() {{
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
            }}));

            add(new GoodsIs(3, new ArrayList<Integer>() {{
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
            }}));

            add(new GoodsIs(4, new ArrayList<Integer>() {{
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
            }}));


        }

    };



}
