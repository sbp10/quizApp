package com.example.sabrinapin.multquiz;

import java.util.Arrays;

/**
 * Created by NiallSchroder on 2/13/18.
 */

public class Quiz {
    private ArrayList<Question> mQuestions;
    private final String mTitle;

    public Quiz(String name, Question[] qs)  {
        mTitle = name;
        mQuestions = new ArrayList<Question>(Arrays.asList(qs));
    }

    public int size()  {
        return myQuestions.size();
    }

    public String getName(){
        return myQuestions.size();
    }

    public Question getQuestion(int index){
        if (0 <= index && index < myQuestions.size()){
            return myQuestions.get(index);
        }
        throw new IndexOutOfBoundsException("bad index "+index);
    }

}
