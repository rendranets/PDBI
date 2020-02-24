package com.dicoding.pdbi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpeningActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        Button buttonTelusuri = findViewById(R.id.button_telusuri);
        buttonTelusuri.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
                Intent moveIntent = new Intent(OpeningActivity.this, MainActivity.class);
                startActivity(moveIntent);

    }
}
