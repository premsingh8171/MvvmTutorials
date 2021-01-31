package com.premsinghdaksha.mvvmtutorials.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.clicklistener.Userlogin;
import com.premsinghdaksha.mvvmtutorials.databinding.ActivityMainBinding;
import com.premsinghdaksha.mvvmtutorials.model.UserModel;
import com.premsinghdaksha.mvvmtutorials.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserViewModel userViewModel = new UserViewModel(new UserModel("Enter Email", "Enter password"));
        activityMainBinding.setLogin(userViewModel);

        activityMainBinding.setUserloginevent(new Userlogin() {
            @Override
            public void onClickLogin() {
                Log.d("email____",activityMainBinding.getLogin().getEmail_vm());
            }
        });
    }
}