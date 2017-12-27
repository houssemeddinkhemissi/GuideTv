package com.bitsplease.guidetv.guidetv;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    FragmentManager f;
    FragmentTransaction tf;
    Fragment login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         login = new LoginFragment();
         register = new RegisterFragment();
         f = getFragmentManager();
         tf = f.beginTransaction();
        tf.add(R.id.gu1,login);
        tf.commit();
      

    }
}
