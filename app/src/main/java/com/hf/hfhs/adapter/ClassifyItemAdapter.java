package com.hf.hfhs.adapter;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.hf.hfhs.R;
import com.hf.hfhs.bean.CategoryBean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;



public class ClassifyItemAdapter extends BaseAdapter {

    private Context context;
    private List<CategoryBean.DataBean.DataListBean> foodDatas;


    public ClassifyItemAdapter(Context context, List<CategoryBean.DataBean.DataListBean> foodDatas) {
        this.context = context;
        this.foodDatas = foodDatas;
    }


    @Override
    public int getCount() {
        if (foodDatas != null) {
            return foodDatas.size();
        } else {
            return 10;
        }
    }

    @Override
    public Object getItem(int position) {
        return foodDatas.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CategoryBean.DataBean.DataListBean subcategory = foodDatas.get(position);
        ViewHold viewHold = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_category, null);

            viewHold = new ViewHold();
            viewHold.tv_name = (TextView) convertView.findViewById(R.id.item_home_name);
            viewHold.iv_icon = (ImageView) convertView.findViewById(R.id.item_album);
            convertView.setTag(viewHold);
        } else {
            viewHold = (ViewHold) convertView.getTag();
        }
        viewHold.tv_name.setText(subcategory.getTitle());
        try {
            viewHold.iv_icon.setImageBitmap(getBitmap(subcategory.getImgURL()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertView;


    }

    private static class ViewHold {
        private TextView tv_name;
        private ImageView iv_icon;
    }

    private Bitmap getBitmap(String image) throws IOException {
        InputStream open = context.getAssets().open(image);
        return BitmapFactory.decodeStream(open);
    }

}
