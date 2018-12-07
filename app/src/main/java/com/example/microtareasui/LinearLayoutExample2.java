package com.example.microtareasui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutExample2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_example2);

        Button mButton = (Button) findViewById(R.id.button2b);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( LinearLayoutExample2.this, MainActivity.class));
            }
        });

        Button hButton = (Button) findViewById(R.id.button1);
        hButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( LinearLayoutExample2.this, LinearLayoutExample.class));
            }
        });
    }
}
