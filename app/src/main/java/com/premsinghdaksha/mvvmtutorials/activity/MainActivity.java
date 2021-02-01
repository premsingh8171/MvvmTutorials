package com.premsinghdaksha.mvvmtutorials.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.databinding.ActivityMainBinding;
import com.premsinghdaksha.mvvmtutorials.viewmodel.UserViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserViewModel userViewModel;
    private List<UserViewModel> userViewModelArrayList = new ArrayList<>();
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserViewModel userViewModel = new UserViewModel();
        userViewModel.setEmail_vm("Prem");
        userViewModel.setPassword_vm("password");
        activityMainBinding.setUser(userViewModel);
    }
}