package com.example.sabrinapin.multquiz;

import java.util.Arrays;

/**
 * Created by NiallSchroder on 2/13/18.
 */

public class Quiz {
    private ArrayList<Question> mQuestions; //list of questions
    private final String mTitle; //title of quiz

    public Quiz(String name, Question[] qs)  {
        mTitle = name;
        mQuestions = new ArrayList<Question>(Arrays.asList(qs));
    }

    //how many questions are in the quiz
    public int size()  {
        return myQuestions.size();
    }

    //what is name of quiz
    public String getName(){
        return myQuestions.size();
    }

    //get me a mf question
    public Question getQuestion(int index){
        if (0 <= index && index < myQuestions.size()){
            return myQuestions.get(index);
        }
        throw new IndexOutOfBoundsException("bad index "+index);
    }

}
