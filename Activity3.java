package com.example.assignment2_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        button4 = (Button) findViewById(R.id.back);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity()
    {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
