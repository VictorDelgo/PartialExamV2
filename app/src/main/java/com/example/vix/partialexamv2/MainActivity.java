package com.example.vix.partialexamv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B1;
    Button B2;
    Button B3;
    Button B4;
    TextView Score;
    int ROCK;
    int PAPER;
    int SCISSORS;
    int ROCKU;
    int PAPERU;
    int SCISSORSU;
    int user;
    int win;
    int CP;

    private void play() {
        int rand =  ((int)(Math.random() * 10)) % 3;

        switch (rand) {
            case 0:
                ROCK=1;
                break;
            case 1:
                PAPER=1;
                break;
            case 2:
                SCISSORS=1;
                break;
        }
        if(rand == user) {
            Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_LONG).show();
        }
        else if(rand == ROCK && user == SCISSORSU) {
            Toast.makeText(getApplicationContext(), "LOSS", Toast.LENGTH_LONG).show();;
            CP++;
        }
        else if(rand == PAPER && user == ROCKU) {
            Toast.makeText(getApplicationContext(), "LOSS", Toast.LENGTH_LONG).show();
            CP++;
        }
        else if(rand == SCISSORS && user == PAPERU) {
            Toast.makeText(getApplicationContext(), "LOSS", Toast.LENGTH_LONG).show();
            CP++;
        } else {
            Toast.makeText(getApplicationContext(), "WIN", Toast.LENGTH_LONG).show();
            win++;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1=findViewById(R.id.button);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);
        B4=findViewById(R.id.button4);
        Score=findViewById(R.id.textView);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            play();
            ROCKU=1; //ROCK

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                PAPERU=1; //PAPER
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                SCISSORSU=1; //SCISSORS
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                win=0;
            }
        });
        //Score.setText(win);







    }
}
