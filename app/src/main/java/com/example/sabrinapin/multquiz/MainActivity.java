package com.example.sabrinapin.multquiz;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Quiz mQuiz;

    private TextView mScoreView;
    private TextView mQuestionView;


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    private String mAnswer;

//    private int mScore;
//    private int mQuestionNum; //index used to determine when quiz is over and increments as questions progress
//    private int mCorrect; //increments when user inputs correct
//    private String scoreBase; //how many questions there are

    private boolean finished;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionView = (TextView) this.findViewById(R.id.question_text);
        mScoreView = (TextView) this.findViewById(R.id.score_view);
//        scoreBase = mScoreView.getText().toString(); //work on this in xml file perhaps
        mButton1 =  (Button) this.findViewById(R.id.button1);
        mButton2= (Button) this.findViewById(R.id.button2);
        mButton3 = (Button) this.findViewById(R.id.button3);
        mButton4 = (Button) this.findViewById(R.id.button4);

        //if statement about SavedInstanceState but I'm not sure why/what



        Context c = getApplicationContext();
        newGame();





       // XMLQuizGenerator.createQuizes(c);
        //parser shit


//        mQuiz = QuizGenerator.getQuiz();
//        Question q = mQuiz.getQuestion(mQuestionNum);
//        mQuestionView.setText(q.getQuestionPhrase());
//        String[] mAnswers = Arrays.copyOf(q.getAnswers().keySet().toArray(), q.getAnswers().keySet().size(), String[].class);
//        mButton1.setText(mAnswers[0]);
//        mButton2.setText(mAnswers[1]);
//        mButton3.setText(mAnswers[2]);
//        mButton4.setText(mAnswers[3]);


    }

    //NOT doing left/right click
    public void click(View button){
        //do something with Toast then
        //updateScore();

    }

    public void updateScore(){
//        mQuestionNum += 1;
//        int numRemaining = mQuiz.size() - mQuestionNum;
//        String s =  String.format(" %d/%d with %d to go",mCorrect, mQuiz.size(),numRemaining);//mCorrect+"/"+mQuiz.size()+" questions correct with "+numRemaining+" questions remaining";
        mScoreView.setText(mQuiz.updateScoreboard());//may just need to remove scoreBase

        if(mQuiz.getQuestionNum() < mQuiz.size()){
            askQuestion(); // will be made further down in this class
        }

        else{
            finished = true;

            mQuestionView.setVisibility(View.INVISIBLE);
            mScoreView.setText(mQuiz.processResults());

            Toast.makeText(MainActivity.this, "the end", Toast.LENGTH_SHORT).show();
            //TODO endGame() or restartGame() method

            mButton1.setVisibility(View.INVISIBLE);
            mButton4.setVisibility(View.INVISIBLE);
            mButton2.setText("New Quiz?");
            mButton3.setText("Exit");

            mButton2.setBackgroundColor(Color.GREEN);
            mButton3.setBackgroundColor(Color.RED);





        }

    }

    //CREATE onCreateOptions
    //Create onPrepareOptions
    //create onOptionsItemSelected


    private void newGame(String title ){
        //line for XMLQuizGenerator
        //fill in later

    }

    public void newGame(Quiz q){

    }

    private void newGame()  {
        mQuiz = QuizGenerator.getQuiz();
        finished = false;
//        String s =  String.format(" %d/%d with %d to go",mCorrect, mQuiz.size(),mQuiz.size());//mCorrect+"/"+mQuiz.size()+" questions correct with "+numRemaining+" questions remaining";
        mScoreView.setText(mQuiz.updateScoreboard());//may just need to remove scoreBase
//        updateScore();
        askQuestion();

    }

    private void askQuestion(){
        final Question q = mQuiz.getQuestion(mQuiz.getQuestionNum());
        mQuestionView.setText(q.getQuestionPhrase());
        final String[] mAnswers = Arrays.copyOf(q.getAnswers().keySet().toArray(), q.getAnswers().keySet().size(), String[].class);
        mButton1.setText(mAnswers[0]);
        mButton2.setText(mAnswers[1]);
        mButton3.setText(mAnswers[2]);
        mButton4.setText(mAnswers[3]);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!finished) {
                    mQuiz.incrementScore(q.getAnswers().get(mAnswers[0]));
                    updateScore();
                }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!finished) {
                    mQuiz.incrementScore(q.getAnswers().get(mAnswers[1]));
                    updateScore();
                }
                else {

                }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!finished) {
                    mQuiz.incrementScore(q.getAnswers().get(mAnswers[2]));
                    updateScore();
                }
                else {
                    finish();
                    System.exit(0);
                }
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!finished) {
                    mQuiz.incrementScore(q.getAnswers().get(mAnswers[3]));
                    updateScore();
                }
            }
        });





    }


    public void endGame()  {

    }

    public void localCallback(String rawString){
        Log.d("quizmaster", "local callback");
        //the rest of the JSONParser
    }

}





