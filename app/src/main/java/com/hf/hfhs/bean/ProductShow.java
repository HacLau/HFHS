package com.hf.hfhs.bean;

import java.util.List;

public class ProductShow {
    private int id;
    private List<Integer> imageList ;
    private List<String> titleList;


    public ProductShow(int id) {
        this.id = id;
    }

    public ProductShow(int id, List<Integer> imageList,List<String> titleList) {
        this.id = id;
        this.imageList = imageList;
        this.titleList = titleList;
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

    public List<String> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<String> titleList) {
        this.titleList = titleList;
    }

    public void setImageList(List<Integer> imageList) {
        this.imageList = imageList;
    }
}
