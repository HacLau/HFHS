package com.hf.hfhs;

import com.hf.hfhs.bean.CartListBeanModel;
import com.hf.hfhs.bean.ProductShow;
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

    public static List<ProductShow> PRODUCTTYPE = new ArrayList<ProductShow>(){
        {
            //大连8头海参
            add(new ProductShow(1, new ArrayList<Integer>() {{
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
                add(R.mipmap.banner1);
            }},new ArrayList<String>(){
                {
                    add("精选大连海参,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,8只一盒.每盒的数量分量可自由选择!!");
                }
            }));

            //大连6头海参
            add(new ProductShow(2, new ArrayList<Integer>() {{
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
                add(R.mipmap.banner2);
            }},new ArrayList<String>(){
                {
                    add("精选大连海参,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选大连海参,6只一盒.每盒的数量分量可自由选择!!");
                }
            }));

            //鲍鱼8头
            add(new ProductShow(3, new ArrayList<Integer>() {{
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
                add(R.mipmap.banner3);
            }},new ArrayList<String>(){
                {
                    add("精选优质鲍鱼,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,8只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,8只一盒.每盒的数量分量可自由选择!!");
                }
            }));

            //鲍鱼6头
            add(new ProductShow(4, new ArrayList<Integer>() {{
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
                add(R.mipmap.banner4);
            }},new ArrayList<String>(){
                {
                    add("精选优质鲍鱼,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,6只一盒.每盒的数量分量可自由选择!!");
                    add("精选优质鲍鱼,6只一盒.每盒的数量分量可自由选择!!");
                }
            }));

            add(new ProductShow(5, new ArrayList<Integer>() {{
                add(R.drawable.hs);
                add(R.drawable.hs);
                add(R.drawable.hs);
                add(R.drawable.hs);
            }},new ArrayList<String>(){
                {
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                }
            }));

            add(new ProductShow(6, new ArrayList<Integer>() {{
                add(R.drawable.by);
                add(R.drawable.by);
                add(R.drawable.by);
                add(R.drawable.by);
            }},new ArrayList<String>(){
                {
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                    add("xxxx,8只一盒.每盒的数量分量可自由选择!!");
                }
            }));


        }

    };

}
