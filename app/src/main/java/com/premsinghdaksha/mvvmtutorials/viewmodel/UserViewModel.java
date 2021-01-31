package com.premsinghdaksha.mvvmtutorials.viewmodel;

import androidx.databinding.BaseObservable;

import com.premsinghdaksha.mvvmtutorials.R;
import com.premsinghdaksha.mvvmtutorials.model.UserModel;
import java.util.Observable;

public class UserViewModel extends BaseObservable {
    public String email_vm;
    public String password_vm;
    public String emailhint_vm;
    public String passwordhint_vm;

    public UserViewModel(UserModel userModel) {
        this.emailhint_vm = userModel.emailhint;
        this.passwordhint_vm = userModel.passwordhint;
    }

    public String getEmail_vm() {
        return email_vm;
    }

    public void setEmail_vm(String email_vm) {
        this.email_vm = email_vm;
        notifyPropertyChanged(R.id.email_);
    }



    public String getPassword_vm() {
        return password_vm;
    }

    public void setPassword_vm(String password_vm) {
        this.password_vm = password_vm;
        notifyPropertyChanged(R.id.password_);

    }

    public String getEmailhint_vm() {
        return emailhint_vm;
    }

    public void setEmailhint_vm(String emailhint_vm) {
        this.emailhint_vm = emailhint_vm;
    }

    public String getPasswordhint_vm() {
        return passwordhint_vm;
    }

    public void setPasswordhint_vm(String passwordhint_vm) {
        this.passwordhint_vm = passwordhint_vm;
    }
}
