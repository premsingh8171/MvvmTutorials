package com.premsinghdaksha.mvvmtutorials.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.clicklistener.ItemClickEvent;
import com.premsinghdaksha.mvvmtutorials.databinding.ListRowBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.NewsViewModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsViewModel> {
    ArrayList<NewsViewModel> newsViewModelArrayList;
    Context context;
    ItemClickEvent itemClickEvent;
    public NewsAdapter(@NonNull Context context, ArrayList<NewsViewModel> newsViewModelArrayList) {
        super(context, R.layout.list_row,newsViewModelArrayList);
        this.context=context;
        this.newsViewModelArrayList=newsViewModelArrayList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding = DataBindingUtil.inflate(layoutInflater,R.layout.list_row,parent,false);
        listRowBinding.setNewslist(newsViewModelArrayList.get(position));
        return listRowBinding.getRoot();
    }
}
