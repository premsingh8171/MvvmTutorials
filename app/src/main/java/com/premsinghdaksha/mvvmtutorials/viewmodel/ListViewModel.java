package com.premsinghdaksha.mvvmtutorials.viewmodel;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.premsinghdaksha.mvvmtutorials.R;

/**
 * Created by Er.prem singh dakhsa on 01/02/2021.
 */

public class ListViewModel extends BaseObservable {


    public String title, desc, imagepath;
    public String listViewId;

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getListViewId() {
        return listViewId;
    }

    public void setListViewId(String listViewId) {
        this.listViewId = listViewId;
    }

    public ListViewModel(String title, String desc, String imagepath) {
        this.title = title;
        this.desc = desc;
        this.imagepath = imagepath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl) {
        Log.d("imageUrl___", imageUrl);

        Glide.with(imageView.getContext()).load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background).into(imageView);


    }

    public String getImageUrl() {
        return imagepath;
    }


}

