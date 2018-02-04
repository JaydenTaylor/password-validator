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
        //STAGE 1 conditions
        //Password must be 8 digits
        if(s.length() < 8)
            return false;
        //Password cannot be password
        if(s.equalsIgnoreCase("password"))
            return false;
        //STAGE 2 conditions
        //1: must have upper and lower case
        if(s.toLowerCase().equals(s))
            return false;
        //2: must contain digit
        boolean found = false;
        for (char c : s.toCharArray())
            if(found = Character.isDigit(c))
                break;
        if(!found)
            return false;
        //3: Password must have lower case char
        if(s.toUpperCase().equals(s))
            return false;
        return true;
    }
}
