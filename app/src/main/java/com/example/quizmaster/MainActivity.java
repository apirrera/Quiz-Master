package com.example.quizmaster;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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

   /* public void displayCorrect(){
        TextView scoreView = findViewById(R.id.summary);
    } */

    // Defines checkbox variables to match with ids and validates checkbox answers and displays incorrect and correct
    public void Complete(View v) {
        CheckBox Q1Answer1 = (CheckBox) findViewById(R.id.checkbox1a); //Here you see the type variable name, type again linked to the Id
        CheckBox Q1Answer2 = (CheckBox) findViewById(R.id.checkbox1b);
        CheckBox Q1Incorrect1 = (CheckBox) findViewById(R.id.checkbox1c);
        CheckBox Q1Incorrect2 = (CheckBox) findViewById(R.id.checkbox1d);
        CheckBox Q2Answer1 = (CheckBox) findViewById(R.id.checkbox2a); //Here you see the type variable name, type again linked to the Id
        CheckBox Q2Answer2 = (CheckBox) findViewById(R.id.checkbox2b);
        CheckBox Q2Incorrect1 = (CheckBox) findViewById(R.id.checkbox2c);
        CheckBox Q2Incorrect2 = (CheckBox) findViewById(R.id.checkbox2d);

        if (Q1Answer1.isChecked() && Q1Answer2.isChecked()) { //Here the variables are referenced, it states if these two are checked then add 25 to total score
            Results = Results + 25;
            //displayResults(Results);
        }
        if (Q1Incorrect1.isChecked() && Q1Incorrect2.isChecked()) {
        }

        // Question 2 Checkbox
        if (Q2Answer1.isChecked() && Q2Answer2.isChecked()) { //Here the variables are referenced, it states if these two are checked then add 25 to total score
            Results = Results + 25;
            //displayResults(Results);
        }
        if (Q2Incorrect1.isChecked() && Q2Incorrect2.isChecked()) {
        }

        // Defines edittext variables to match with ids and validates checkbox answers and displays incorrect and correct
        EditText Question3 = (EditText) findViewById(R.id.entertext);
        String Question3String = Question3.getText().toString().trim();

        if (Question3String.equalsIgnoreCase("Test")) {
            Results = Results + 25;
            // displayResults(Results);
        }

        // Defines radiobutton variables to match with ids and validates checkbox answers and displays incorrect and correct
        RadioButton Q4ARadiobutton = (RadioButton) findViewById(R.id.Answer4);
        if (Q4ARadiobutton.isChecked()) {
            Results = Results + 25;
            //displayResults(Results);
        }
    }

    public void SubmitClick(View view) {
        Button SubmitClick = (Button) findViewById(R.id.Submit);
        Button RetakeClick = (Button) findViewById(R.id.Retake);
        SubmitClick.setVisibility(View.GONE);
        RetakeClick.setVisibility(View.VISIBLE);
        displayResults(Results);
    }
}