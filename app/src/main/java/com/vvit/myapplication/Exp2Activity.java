package com.vvit.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exp2Activity extends AppCompatActivity {

    //Create Object for components/Views
    TextView resultView;
    EditText inputView;
    Button okButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp2_first);

        //Link component in java file with view in xml
        resultView = findViewById(R.id._output_first_view);
        inputView = findViewById(R.id._first_name);
        okButton = findViewById(R.id._ok_first_button);

    }

    public void handleClick(View view) {
        String inputValue = inputView.getText().toString();
        resultView.setText(inputValue);
    }
}