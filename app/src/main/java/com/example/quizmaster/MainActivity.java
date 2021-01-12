package com.example.quizmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        private CheckBox answer1, answer2, incorrect1, incorrect2;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        incorrect1 = findViewById(R.id.incorrect1);
        incorrect2 = findViewById(R.id.incorrect2);
        Results = findViewById(R.id.activity_end_page.Results);

        answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        if (answer1.isChecked())
                                public void Results (View v){
                                Results = Results + 25;
                                Results(Results);
                        }
                        else
                }

                }
        }

        public void Results(int score) {
                TextView scoreView = (TextView) findViewById(R.id.Results);
                scoreView.setText(String.valueOf(score));
        }

        }
}