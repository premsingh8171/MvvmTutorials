package com.premsinghdaksha.mvvmtutorials.model;

public class UserModel {
    public String email;
    public String password;
    public String emailhint;
    public String passwordhint;

    public UserModel() {
    }

    public UserModel(String emailhint, String passwordhint) {
        this.emailhint = emailhint;
        this.passwordhint = passwordhint;
    }

}
