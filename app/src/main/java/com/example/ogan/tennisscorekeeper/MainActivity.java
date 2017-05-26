package com.example.ogan.tennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int set1A = 0;
    int set2A = 0;
    int set3A = 0;
    int set1B = 0;
    int set2B = 0;
    int set3B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton setA = (RadioButton) findViewById(R.id.player1_set1);
        setA.setChecked(true);
        RadioButton setB = (RadioButton) findViewById(R.id.player2_set1);
        setB.setChecked(true);
    }

    //Methods for player 1
    public void incrementScoreA(View view){
        incrementSetA();
        if(scoreA == 0){
            scoreA = 15;
        } else if(scoreA == 15){
            scoreA = 30;
        } else if(scoreA == 30){
            scoreA = 40;
        }
        displayScoreA();
    }

    public void decrementScoreA(View view){
        if(scoreA == 15){
            scoreA = 0;
        } else if(scoreA == 30){
            scoreA = 15;
        } else if(scoreA == 40){
            scoreA = 30;
        }
        displayScoreA();
    }

    public void displayScoreA(){
        TextView textView = (TextView) findViewById(R.id.scoreA);
        textView.setText(String.valueOf(scoreA));
    }

    public void incrementSetA(){
        RadioButton set1 = (RadioButton) findViewById(R.id.player1_set1);
        RadioButton set2 = (RadioButton) findViewById(R.id.player1_set2);
        RadioButton set3 = (RadioButton) findViewById(R.id.player1_set3);
        if(set1.isChecked() && scoreA == 40){
            set1A = set1A + 1;
        } else if(set2.isChecked() && scoreA == 40){
            set2A = set2A + 1;
        } else if(set3.isChecked() && scoreA == 40){
            set3A = set3A + 1;
        }
        displaySetA();
    }

    public void displaySetA(){
        RadioButton set1 = (RadioButton) findViewById(R.id.player1_set1);
        RadioButton set2 = (RadioButton) findViewById(R.id.player1_set2);
        RadioButton set3 = (RadioButton) findViewById(R.id.player1_set3);
        if(set1.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setA_set1);
            setA.setText(String.valueOf(set1A));
        } else if(set2.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setA_set2);
            setA.setText(String.valueOf(set2A));
        } else if(set3.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setA_set3);
            setA.setText(String.valueOf(set3A));
        }
    }

    //Methods for player 2
    public void incrementScoreB(View view){
        incrementSetB();
        if(scoreB == 0){
            scoreB = 15;
        } else if(scoreB == 15){
            scoreB = 30;
        } else if(scoreB == 30){
            scoreB = 40;
        }
        displayScoreB();
    }

    public void decrementScoreB(View view){
        if(scoreB == 15){
            scoreB = 0;
        } else if(scoreB == 30){
            scoreB = 15;
        } else if(scoreB == 40){
            scoreB = 30;
        }
        displayScoreB();
    }

    public void displayScoreB(){
        TextView textView = (TextView) findViewById(R.id.scoreB);
        textView.setText(String.valueOf(scoreB));
    }

    public void incrementSetB(){
        RadioButton set1 = (RadioButton) findViewById(R.id.player2_set1);
        RadioButton set2 = (RadioButton) findViewById(R.id.player2_set2);
        RadioButton set3 = (RadioButton) findViewById(R.id.player2_set3);
        if(set1.isChecked() && scoreB == 40){
            set1B = set1B + 1;
        } else if(set2.isChecked() && scoreB == 40){
            set2B = set2B + 1;
        } else if(set3.isChecked() && scoreB == 40){
            set3B = set3B + 1;
        }
        displaySetB();
    }

    public void displaySetB(){
        RadioButton set1 = (RadioButton) findViewById(R.id.player2_set1);
        RadioButton set2 = (RadioButton) findViewById(R.id.player2_set2);
        RadioButton set3 = (RadioButton) findViewById(R.id.player2_set3);
        if(set1.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setB_set1);
            setA.setText(String.valueOf(set1B));
        } else if(set2.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setB_set2);
            setA.setText(String.valueOf(set2B));
        } else if(set3.isChecked()){
            TextView setA = (TextView) findViewById(R.id.setB_set3);
            setA.setText(String.valueOf(set3B));
        }
    }

    public void resetPoints(View view){
        scoreA = 0;
        scoreB = 0;
        displayScoreA();
        displayScoreB();
    }

    public void resetSets(View view){
        set1A = 0;
        set2A = 0;
        set3A = 0;
        set1B = 0;
        set2B = 0;
        set3B = 0;
        displaySetA();
        displaySetB();
    }
}
