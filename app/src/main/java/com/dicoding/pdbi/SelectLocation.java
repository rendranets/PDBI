package com.dicoding.pdbi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SelectLocation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_location);

        ImageButton btnBack = (ImageButton) findViewById(R.id.button_back_select_location);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SelectLocation.this, MainActivity.class);
        startActivity(intent);
    }
}
