package com.premsinghdaksha.mvvmtutorials.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.adapter.NewsAdapter;
import com.premsinghdaksha.mvvmtutorials.databinding.ActivityMainBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.NewsViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NewsViewModel newsViewModel;
    private ArrayList<NewsViewModel> newsViewModelArrayList = new ArrayList<>();
    private NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        newsViewModel = new NewsViewModel();
        newsViewModelArrayList = newsViewModel.getArrayListNews();
        adapter = new NewsAdapter(MainActivity.this, newsViewModelArrayList);
        activityMainBinding.listview.setAdapter(adapter);

    }
}