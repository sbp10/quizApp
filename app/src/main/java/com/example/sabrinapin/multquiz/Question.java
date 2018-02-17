package com.example.sabrinapin.multquiz;
import java.util.HashMap;
import java.util.TreeMap;
/**
 * Created by sabrinapin on 2/13/18.
 */

public class Question {

    private String mQuestionPhrase; //this is the words that make up the physical question
    private TreeMap <String, Integer> mAnswers;
    private String mCorrAnswer; //correct answer
    private String[] mWAnswers; //array of incorrect answers

    public Question (String q, TreeMap<String, Integer> entries){
        mQuestionPhrase = q; //initializing the question
        mAnswers = entries;
      //  mCorrAnswer = r;
       // mWAnswers = wrong;
    }


    //possibly need another constructor...but i'll get back to that later

    //possibly make another constructor for personality quiz
   //with different parameter
    //instead of mWAnswers and mCorrAnswer do HashMap with answer as key and point value as value
    //no score is calculated based off of point values and assigns you to different result
    //no such thing as right or wrong

    public String getQuestionPhrase(){
        return mQuestionPhrase;
    }

    public String getCorrectAnswer(){
        return mCorrAnswer;
    }

    public String getWrongAnswer(){ //separate method for when there is only 1 incorrect answer
        return mWAnswers[0];
    }

    public TreeMap<String, Integer> getAnswers(){ //returns the array
        return mAnswers;
    }

    public int numQuestions() {  //return num of questions
        return mAnswers.size();
    }
}

