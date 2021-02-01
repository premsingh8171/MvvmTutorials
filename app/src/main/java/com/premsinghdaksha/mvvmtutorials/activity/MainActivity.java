package com.premsinghdaksha.mvvmtutorials.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.adapter.CustomAdapter;
import com.premsinghdaksha.mvvmtutorials.databinding.ActivityMainBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.ListViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ListViewModel> listViewModels = new ArrayList<>();
    private ActivityMainBinding activityMainBinding;
    private CustomAdapter customAdapter;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        listview = findViewById(R.id.listview);
        for (int i = 0; i < 20; i++) {
            ListViewModel userViewModel = new ListViewModel("Er.Prem singh", "Native Android apllication developer ", "https://www.skcript.com/svrmedia/heroes/how-to-make-a-circular-image-view-in-android-without-third-party-library@1.5x-1.png");
            listViewModels.add(userViewModel);
            //activityMainBinding.setListview(userViewModel);
        }
        customAdapter = new CustomAdapter(this, listViewModels);
        listview.setAdapter(customAdapter);


    }
}