package com.learning.deznorth.learnnetworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Button getButton = (Button) findViewById(R.id.getButton);

        getButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}
