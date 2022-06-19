package com.vvit.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exp4Activity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView result;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp4);

        firstValue = findViewById(R.id._first_value);
        secondValue = findViewById(R.id._second_value);
        result = findViewById(R.id._result);
        addButton = findViewById(R.id._click_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int output = first + second;
                result.setText(String.valueOf(output));
            }
        });


    }
}