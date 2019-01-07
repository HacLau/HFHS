package com.hf.hfhs.bean;

/**
 * Created by Administrator on 2018/10/23.
 */

public class GoodsListBeanModel {
    private int id;
    private String icon;
    private String title;
    private String price;
    private String url;

    public GoodsListBeanModel(int id, String icon, String title, String price, String url) {
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.price = price;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
