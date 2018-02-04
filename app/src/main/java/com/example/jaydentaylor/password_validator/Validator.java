package com.example.jaydentaylor.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Validator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    public static boolean validate(String s) {
        if(s.length() < 8 || s.equalsIgnoreCase("password"))
            return false;
        return true;
    }
}
