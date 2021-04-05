/*
    Aidan Quimby
    ECE 387
    Lab - Mobile App
    4/4/2021
 */


package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variable to store number of presses
    private int pressCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to increment pressCount
    public void submitOrder(View view) {
        pressCount++;
        display(pressCount);
    }

    // Method to display number of presses on screen
    private void display(int n) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + n);
    }

}