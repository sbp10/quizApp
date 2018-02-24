package com.example.sabrinapin.multquiz;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by NiallSchroder on 2/13/18.
 */

public class Quiz {
    private ArrayList<Question> mQuestions; //list of questions
    private final String mTitle; //title of quiz
    int mScore;
    int mQuestionNum;
    int mNumRemaining;

    public Quiz(String name, Question[] qs)  {
        mTitle = name;
        mQuestions = new ArrayList<Question>(Arrays.asList(qs));
        mScore = 0;
        mQuestionNum = 0;
        mNumRemaining = qs.length;
    }

    //how many questions are in the quiz
    public int size()  {
        return mQuestions.size();
    }

    //what is name of quiz
    public String getName(){
        return mTitle;
    }

    //get me a mf question
    public Question getQuestion(int index){
        if (0 <= index && index < mQuestions.size()){
            return mQuestions.get(index);
        }
        throw new IndexOutOfBoundsException("bad index "+index);
    }

    public void incrementScore(int i)  {
        mScore += i;
    }

    public String updateScoreboard()  {
        return null;
    }

    public String processResults()  {
        return null;
    }


    public int getScore() {
        return mScore;
    }

    public int getQuestionNum() {
        return mQuestionNum;
    }



}
