package com.premsinghdaksha.mvvmtutorials.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.premsinghdaksha.mvvmtutorials.databinding.NewsBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.NewsViewModel;

import java.util.List;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder_> {
    List<NewsViewModel> newsViewModelArrayList;
    Context context;
    private LayoutInflater layoutInflater;

    public NewsAdapter(List<NewsViewModel> newsViewModelArrayList, Context context) {
        this.newsViewModelArrayList = newsViewModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder_ onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder_(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_ holder, int position) {
        NewsViewModel newsViewModel = newsViewModelArrayList.get(position);
        holder.bind(newsViewModel);

    }

    @Override
    public int getItemCount() {
        return newsViewModelArrayList.size();
    }

    public class ViewHolder_ extends RecyclerView.ViewHolder {
        private NewsBinding newsBinding;

        public ViewHolder_(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
        }

        public void bind(NewsViewModel newsViewModel) {
            this.newsBinding.setNewslist(newsViewModel);
        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
}
