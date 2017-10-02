package com.example.joji.gridbasedlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by student5 on 10/2/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
    };

    public ImageAdapter (Context c){
        mContext = c;
    }

    @Override
    public int getCount(){
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position){
        return mThumbIds[position];
    }

    @Override
    public long getItemId (int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
        return imageView;
    }


}
