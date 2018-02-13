package com.example.sabrinapin.multquiz;

/**
 * Created by sabrinapin on 2/13/18.
 */

public class Question {

    private String mQuestion; //this is the words that make up the physical question
    private String mCorrAnswer; //correct answer
    private String[] mWAnswers; //array of incorrect answers

    public Question (String q, String r, String[] wrong){
        mQuestion = q; //initializing the question
        mCorrAnswer = r;
        mWAnswers = wrong;
    }

    //possibly need another constructor...but i'll get back to that later

    public String getQuestion(){
        return mQuestion;
    }

    public String getCorrectAnswer(){
        return mCorrAnswer;
    }

    public String getWrongAnswer(){ //separate method for when there is only 1 incorrect answer
        return mWAnswers[0];
    }

    public String[] getWrongAnswers(){ //returns the array
        return mWAnswers;
    }

    public int numQuestions() {  //return num of questions
        return mWAnswers.length + 1;
    }
}
