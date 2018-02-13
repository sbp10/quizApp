package com.example.sabrinapin.multquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     private QuizLibrary mQuiz = new QuizLibrary();

    private TextView mScoreView;
    private TextView mScoreText;
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

        mButton1 = (Button) this.findViewById(R.id.button1);
        mButton2 = (Button) this.findViewById(R.id.button2);
        mButton3 = (Button) this.findViewById(R.id.button3);
        mButton4 = (Button) this.findViewById(R.id.button4);
        mScoreView = (TextView) this.findViewById(R.id.score);
        mScoreText = (TextView) this.findViewById(R.id.score_text);


    }

    //update question method
    //method to update score

}
