package com.bitsplease.guidetv.guidetv;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {
    Button b1 , b2;
    FragmentManager f;
    FragmentTransaction tf;
    Fragment login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            b1 = (Button)findViewById(R.id.lb);
            b2 = (Button)findViewById(R.id.rb);
         login = new LoginFragment();
         register = new RegisterFragment();
         f = getFragmentManager();
         tf = f.beginTransaction();
        tf.add(R.id.gu1,login);
        tf.commit();
        b1.setPressed(true);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            b2.setPressed(false);
            b1.setPressed(true);
                f = getFragmentManager();
                tf = f.beginTransaction();
                tf.replace(R.id.gu1,login);
                tf.commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f = getFragmentManager();
                tf = f.beginTransaction();
                b1.setPressed(false);
                b2.setPressed(true);

                tf.replace(R.id.gu1,register);
                tf.commit();


            }
        });
    }
}
