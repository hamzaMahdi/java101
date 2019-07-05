package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button AddButton = (Button) findViewById(R.id.AddButton);
        Button SubtractionButton = (Button) findViewById(R.id.SubtractionButton);
        Button MultiplicationButton = (Button) findViewById(R.id.MultiplicationButton);
        Button DivisionButton = (Button) findViewById(R.id.DivisionButton);

        AddButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText EditTextOne = (EditText) findViewById(R.id.InputNumber1);
            EditText EditTextTwo = (EditText) findViewById(R.id.InputNumber2);
            TextView resultTextView = (TextView) findViewById(R.id.TextView);

            double a = Double.parseDouble(EditTextOne.getText().toString());
            double b = Double.parseDouble(EditTextTwo.getText().toString());
            double result = a + b;


            resultTextView.setText(""+result);
        }
    });
    SubtractionButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText EditTextOne = (EditText) findViewById(R.id.InputNumber1);
            EditText EditTextTwo = (EditText) findViewById(R.id.InputNumber2);
            TextView resultTextView = (TextView) findViewById(R.id.TextView);
            double a = Double.parseDouble(EditTextOne.getText().toString());
            double b = Double.parseDouble(EditTextTwo.getText().toString());
            double result = a - b;


            resultTextView.setText(""+result);
        }
    });

    MultiplicationButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText EditTextOne = (EditText) findViewById(R.id.InputNumber1);
            EditText EditTextTwo = (EditText) findViewById(R.id.InputNumber2);
            TextView resultTextView = (TextView) findViewById(R.id.TextView);
            double a = Double.parseDouble(EditTextOne.getText().toString());
            double b = Double.parseDouble(EditTextTwo.getText().toString());
            double result = a * b;


            resultTextView.setText(""+result);
        }
    });
    DivisionButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText EditTextOne = (EditText) findViewById(R.id.InputNumber1);
            EditText EditTextTwo = (EditText) findViewById(R.id.InputNumber2);
            TextView resultTextView = (TextView) findViewById(R.id.TextView);
            double a = Double.parseDouble(EditTextOne.getText().toString());
            double b = Double.parseDouble(EditTextTwo.getText().toString());
            double result = a / b;
            resultTextView.setText(""+result);
        }
    });

    }
}
