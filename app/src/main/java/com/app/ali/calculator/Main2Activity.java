package com.app.ali.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String std = intent.getStringExtra(MainActivity.result);
         TextView tex = (TextView) findViewById(R.id.textView3);
        tex.setText(std);


    }


    public void back(View v)
    {
        Intent in = new Intent (this,MainActivity.class);
        startActivity(in);



    }





}
