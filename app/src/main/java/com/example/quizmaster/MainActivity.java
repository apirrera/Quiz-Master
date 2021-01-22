package com.example.quizmaster;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //defining values here
    int Results = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is the method to change the score and display it
    public void displayResults(int score) {
        TextView scoreView = findViewById(R.id.Results);
        scoreView.setText(String.valueOf(score));
    }

    // The actual code with variables and outputs Checkbox else/if code
    public void Complete(View v) {
        CheckBox Answer1 = (CheckBox) findViewById(R.id.checkbox1a);
        CheckBox Answer2 = (CheckBox) findViewById(R.id.checkbox1b);
        CheckBox Incorrect1 = (CheckBox) findViewById(R.id.checkbox1c);
        CheckBox Incorrect2 = (CheckBox) findViewById(R.id.checkbox1d);
        if (Answer1.isChecked() && Answer2.isChecked()) {
            Results = Results + 25;
            displayResults(Results);
        }
        if (Incorrect1.isChecked() && Incorrect2.isChecked()) {
        }




        /*Intent to send results to 2nd page
        private void openEndPage() {
                Intent intent = new Intent(this, EndPage.class);
                startActivity(intent);
        } */
    }


}