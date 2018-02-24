package com.example.sabrinapin.multquiz;

import java.util.ArrayList;

/**
 * Created by NiallSchroder on 2/24/18.
 */

public interface QuizInterface {

    public String processResults(); //returns output to be displayed at end of quiz
//    public ArrayList<Question> getQuestions(); //returns arraylist of questions
    public String updateScoreboard();
    public int getScore();
    public int getQuestionNum();
    public void incrementScore(int i);


}
