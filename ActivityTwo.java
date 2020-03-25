package com.example.assignment2_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {


    private Button button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);
            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    openActivity();
                }
            });
        }
        public void openActivity()
        {

            Intent i = new Intent(this,Activity3.class);
            startActivity(i);
        }

    }

