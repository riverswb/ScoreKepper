package com.example.myfirstapptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreKeeperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
    }
    public int score = 0;

    public void plusOneOnClick(View view){
        score += 1;
//        string temp = "" + score.toString();
        //view.setText(score);
        TextView tv = (TextView) findViewById(R.id.score);
        tv.setText("" + score);
    }

}
