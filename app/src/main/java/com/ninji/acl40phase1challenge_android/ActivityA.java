package com.ninji.acl40phase1challenge_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);


        Button btnB = findViewById(R.id.button_B);
        Button btnC = findViewById(R.id.button_C);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = ActivityB.newIntent(ActivityA.this);
                startActivity(intent);

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = ActivityC.newIntent(ActivityA.this);
                startActivity(intent);

            }
        });
    }
}
