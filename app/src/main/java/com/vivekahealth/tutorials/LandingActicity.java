package com.vivekahealth.tutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LandingActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_acticity);
    }

    public void OnListClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onCardFlip(View v) {
        startActivity(new Intent(this, CardFlipTest.class));
    }


}
