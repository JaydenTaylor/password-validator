package com.example.jaydentaylor.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Validator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                TextView textView = (TextView) findViewById(R.id.textView);
                if(validate(message))
                    textView.setText("Secure!");
                else
                    textView.setText("Not Secure!");
            }
        });
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
