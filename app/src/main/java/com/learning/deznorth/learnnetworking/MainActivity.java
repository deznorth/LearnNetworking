package com.learning.deznorth.learnnetworking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.buttonDisplay);
        Button createButton = (Button) findViewById(R.id.buttonCreate);
        Button updateButton = (Button) findViewById(R.id.buttonUpdate);
        Button deleteButton = (Button) findViewById(R.id.buttonDelete);

        displayButton.setOnClickListener(this);
        createButton.setOnClickListener(this);
        updateButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.buttonDisplay:
                startActivity(new Intent(MainActivity.this, DisplayActivity.class));
                break;
            case R.id.buttonCreate:
                startActivity(new Intent(MainActivity.this, CreateActivity.class));
                break;
            case R.id.buttonUpdate:
                startActivity(new Intent(MainActivity.this, UpdateActivity.class));
                break;
            case R.id.buttonDelete:
                startActivity(new Intent(MainActivity.this, DeleteActivity.class));
                break;
        }
    }


}
