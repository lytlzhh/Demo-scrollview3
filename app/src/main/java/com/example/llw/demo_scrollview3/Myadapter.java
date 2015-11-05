package com.example.llw.demo_scrollview3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.llw.demo_scrollview3.R.id.image;

/**
 * Created by llw on 2015/11/5.
 */
public class Myadapter extends BaseAdapter {

    private  List<my_get_set> mylist;
    LayoutInflater minflater;
    public Myadapter(List<my_get_set> list,Context context) {
        this.mylist = list;
        minflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return mylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = minflater.inflate(R.layout.my_wight,null);
        ImageView imageView = (ImageView) view.findViewById(image);
        TextView textView1 = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(R.id.text2);
        imageView.setImageResource(mylist.get(position).item_image);
        textView2.setText(mylist.get(position).item_content);
        textView1.setText(mylist.get(position).item_title);
        return view;
    }
}
