package com.dicoding.pdbi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    private ImageView iv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv_splash = findViewById(R.id.iv_splash);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);

        iv_splash.startAnimation(myanim);
        final Intent i = new Intent(this,OpeningActivity.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
                timer.start();
    }
}
