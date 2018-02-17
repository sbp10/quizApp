package com.example.sabrinapin.multquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Quiz mQuiz;

    private TextView mScoreView;
    private TextView mQuestionView;


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    private String mAnswer;

    private int mScore;
    private int mQuestionNum; //index used to determine when quiz is over and increments as questions progress
    private int mCorrect; //increments when user inputs correct
    private int scoreBase; //how many questions there are



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionView = (TextView) this.findViewById(R.id.question_text);
        mScoreView = (TextView) this.findViewById(R.id.score_view);
       // scoreBase = mScoreView.getText().toString(); work on this in xml file perhaps
        mButton1 =  (Button) this.findViewById(R.id.button1);
        mButton2= (Button) this.findViewById(R.id.button2);
        mButton3 = (Button) this.findViewById(R.id.button3);
        mButton4 = (Button) this.findViewById(R.id.button4);

        //if statement about SavedInstanceState but I'm not sure why/what

        Context c = getApplicationContext();
       // XMLQuizGenerator.createQuizes(c);
        //parser shit

        //then restore quiz
    }

    //NOT doing left/right click
    public void click(View button){
        //do something with Toast then
        //updateScore();

    }

    public void updateScore(){
        mQuestionNum += 1;
        int numRemaining = mQuiz.size() - mQuestionNum;
        String s = mCorrect+"/"+mQuiz.size()+" questions correct with "+numRemaining+" questions remaining";
        mScoreView.setText(scoreBase+s);//may just need to remove scoreBase

        if(mQuestionNum < mQuiz.size()){
            askQuestion(); // will be made further down in this class
        }

        else{
            Toast.makeText(MainActivity.this, "the end", Toast.LENGTH_SHORT).show();
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

    private void askQuestion(){
        Question q = mQuiz.getQuestion(mQuestionNum);
        mQuestionView.setText(q.getQuestionPhrase());
        String[] mAnswers = (String[]) q.getAnswers().keySet().toArray();
        mButton1.setText(mAnswers[0]);
        mButton2.setText(mAnswers[1]);
        mButton3.setText(mAnswers[2]);
        mButton3.setText(mAnswers[3]);
    }

    public void localCallback(String rawString){
        Log.d("quizmaster", "local callback");
        //the rest of the JSONParser
    }

}

