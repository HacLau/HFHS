package com.hf.hfhs.bean;

import java.util.List;

public class GoodsIs {
    private int id;
    private List<Integer> imageList ;


    public GoodsIs(int id) {
        this.id = id;

    }

    public GoodsIs(int id, List<Integer> imageList) {
        this.id = id;
        this.imageList = imageList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getImageList() {
        return imageList;
    }

    public void setImageList(List<Integer> imageList) {
        this.imageList = imageList;
    }
}
