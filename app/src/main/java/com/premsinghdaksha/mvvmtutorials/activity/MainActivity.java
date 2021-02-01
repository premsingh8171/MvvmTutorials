package com.premsinghdaksha.mvvmtutorials.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.adapter.NewsAdapter;
import com.premsinghdaksha.mvvmtutorials.viewmodel.NewsViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NewsViewModel newsViewModel;
    private List<NewsViewModel> newsViewModelArrayList = new ArrayList<>();
    private NewsAdapter adapter;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        newsViewModel = new NewsViewModel();
        newsViewModelArrayList = newsViewModel.getArrayListNews();
        adapter = new NewsAdapter(newsViewModelArrayList, MainActivity.this);
        recyclerview.setAdapter(adapter);

    }
}