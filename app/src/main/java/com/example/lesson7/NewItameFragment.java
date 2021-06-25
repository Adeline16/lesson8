package com.example.lesson7;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class NewItameFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";


    private String text , des;
    private int image;

    private ImageView itemImage;
    private TextView itemTitle, itemDes;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public NewItameFragment() {

    }

    public static NewItameFragment newInstance(String text, int image , String des) {
        NewItameFragment fragment = new NewItameFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, text);
        args.putInt(ARG_PARAM2, image);
        args.putString(ARG_PARAM3, des);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            text = getArguments().getString(ARG_PARAM1);
            image = getArguments().getInt(ARG_PARAM2);
            des = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_itame, container, false);
        itemImage = view.findViewById(R.id.item_image);
        itemTitle = view.findViewById(R.id.item_title);
        itemDes = view.findViewById(R.id.item_des);
        itemImage.setImageResource(image);
        itemTitle.setText(text);
        itemDes.setText(des);
        return view;
    }
}