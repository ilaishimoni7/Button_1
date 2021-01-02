package com.example.button_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int i = 1;
    public void click(View view) {
        Button button = (Button)findViewById(R.id.button);
        button.setText("click number "+i);
        i = i+1;
    }
}