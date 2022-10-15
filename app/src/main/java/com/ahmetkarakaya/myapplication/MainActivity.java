package com.ahmetkarakaya.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void degistir(View view){

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cedric2);

    }
}

