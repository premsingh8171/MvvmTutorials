package com.premsinghdaksha.mvvmtutorials.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.premsinghdaksha.mvvmtutorials.BR;

public class UserViewModel extends BaseObservable {
    public String email_vm;
    public String password_vm;

    public UserViewModel() {
    }

    @Bindable
    public String getEmail_vm() {
        return email_vm;
    }

    public void setEmail_vm(String email_vm) {
        this.email_vm = email_vm;
        notifyPropertyChanged(BR.email_vm);
    }

    @Bindable
    public String getPassword_vm() {
        return password_vm;
    }

    public void setPassword_vm(String password_vm) {
        this.password_vm = password_vm;
        notifyPropertyChanged(BR.password_vm );

    }
}
