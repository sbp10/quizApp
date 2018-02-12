package com.example.sabrinapin.multquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private QuizLibrary mQuiz = new QuizLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    private String mAnswer;
    private int mScore;
    private int mQuestionNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //update question method
    //method to update score

}
