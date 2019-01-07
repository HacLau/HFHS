package com.hf.hfhs.bean;

/**
 * Created by Administrator on 2018/10/23.
 */

public class CartListBeanModel {
    private int id;
    private String icon;
    private String title;
    private String price;
    private int number;
    private String url;

    public CartListBeanModel(int id, String icon, String title, String price, int number, String url) {
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.price = price;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
