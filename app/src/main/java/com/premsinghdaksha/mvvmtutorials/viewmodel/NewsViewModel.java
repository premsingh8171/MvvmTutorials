package com.premsinghdaksha.mvvmtutorials.viewmodel;

import com.premsinghdaksha.mvvmtutorials.model.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel {
    public String title_vm;
    public String desc_Vm;

    public NewsViewModel() {
    }

    public NewsViewModel(NewsModel newsModel) {
        this.title_vm = newsModel.title;
        this.desc_Vm = newsModel.desc;
    }

    public String getTitle_Vm() {
        return title_vm;
    }

    public void setTitle_Vm(String title_vm) {
        this.title_vm = title_vm;
    }

    public String getDesc_Vm() {
        return desc_Vm;
    }

    public void setDesc_Vm(String desc_Vm) {
        this.desc_Vm = desc_Vm;
    }

    public List<NewsViewModel> getArrayListNews() {
        ArrayList<NewsViewModel> list = new ArrayList<>();
        NewsViewModel newsViewModel1 = new NewsViewModel(new NewsModel("First Header", "This is a first header"));
        NewsViewModel newsViewModel2 = new NewsViewModel(new NewsModel("Second Header", "This is a Second header"));
        NewsViewModel newsViewModel3 = new NewsViewModel(new NewsModel("third Header", "This is a third header"));
        NewsViewModel newsViewModel4 = new NewsViewModel(new NewsModel("fourth Header", "This is a fourth header"));
        NewsViewModel newsViewModel5 = new NewsViewModel(new NewsModel("five Header", "This is a five header"));
        NewsViewModel newsViewModel6 = new NewsViewModel(new NewsModel("six Header", "This is a six header"));
        list.add(newsViewModel1);
        list.add(newsViewModel2);
        list.add(newsViewModel3);
        list.add(newsViewModel4);
        list.add(newsViewModel5);
        list.add(newsViewModel6);
        return list;

    }
}
