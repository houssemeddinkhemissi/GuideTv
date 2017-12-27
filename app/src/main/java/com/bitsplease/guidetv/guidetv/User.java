package com.bitsplease.guidetv.guidetv;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Houssem Eddin on 27/12/2017.
 */

public class User {
    @SerializedName("username")
    private String username ;
    @SerializedName("email")
    private String email ;
    @SerializedName("password")
    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
