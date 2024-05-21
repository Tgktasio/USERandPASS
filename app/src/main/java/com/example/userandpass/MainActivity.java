package com.example.userandpass;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    TextView result;
    Button login, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPassword);
        result = findViewById(R.id.tvResult);
        login = findViewById(R.id.btnLogin);
        clear = findViewById(R.id.btnClear);

        showResult();



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClearGE4(v);
            }

        });
    }

    public void showResult() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Alvin") &&
                        password.getText().toString().equals("Villanueva")) {
                    result.setText("Welcome " + username.getText().toString() +"!");

                    result.setTextColor(Color.GREEN);
                    clearEntry();

                } else {
                    result.setText("Username and Password does not exist!");

                    result.setTextColor(Color.RED);
                    clearEntry();

                }
            }
        });
    }

    public void clearEntry() {
        result.setVisibility(View.VISIBLE);
        username.setText("");
        password.setText("");
        username.requestFocus();
    }

    public void btnClearGE4(View view) {

        username.getText().clear();
        password.getText().clear();
    }
}
