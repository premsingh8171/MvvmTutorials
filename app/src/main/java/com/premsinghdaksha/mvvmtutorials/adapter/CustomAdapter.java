package com.premsinghdaksha.mvvmtutorials.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.databinding.ListViewBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.ListViewModel;

import java.util.ArrayList;

/**
 * Created by Er.Prem singh daksha on 01/02/2021.
 */

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListViewModel> newslist;
    private ListViewBinding listViewBinding;



    public CustomAdapter(Context context , ArrayList<ListViewModel> newslist)
    {

        this.context = context;
        this.newslist = newslist;

    }



    @Override
    public int getCount() {
        return newslist.size();
    }

    @Override
    public Object getItem(int pos) {
        return newslist.get(pos);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertview, ViewGroup parent) {

        if(convertview == null)
        {
            convertview = LayoutInflater.from(context).inflate(R.layout.innerlayout,null);
            listViewBinding = DataBindingUtil.bind(convertview);
            convertview.setTag(listViewBinding);


        }
        else
        {
            listViewBinding = (ListViewBinding)convertview.getTag();

        }

        listViewBinding.setListviewmodel(newslist.get(pos));
        return listViewBinding.getRoot();

    }
}
