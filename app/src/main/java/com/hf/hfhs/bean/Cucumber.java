package com.hf.hfhs.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Cucumber {
    private String Name;
    private int Price;
    private String Area;
    @Generated(hash = 409011032)
    public Cucumber(String Name, int Price, String Area) {
        this.Name = Name;
        this.Price = Price;
        this.Area = Area;
    }
    @Generated(hash = 398347379)
    public Cucumber() {
    }
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getPrice() {
        return this.Price;
    }
    public void setPrice(int Price) {
        this.Price = Price;
    }
    public String getArea() {
        return this.Area;
    }
    public void setArea(String Area) {
        this.Area = Area;
    }

}
