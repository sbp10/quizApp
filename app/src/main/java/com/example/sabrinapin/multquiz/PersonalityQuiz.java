package com.example.sabrinapin.multquiz;

import java.util.ArrayList;

/**
 * Created by NiallSchroder on 2/24/18.
 */

public class PersonalityQuiz extends Quiz implements QuizInterface {

    ArrayList<String> types;


    public PersonalityQuiz(String name, Question[] qs, ArrayList<String> t) {
        super(name, qs);
        types = t;
    }


    @Override
    public String processResults() {
        String type = "";
        if(mScore <= 9)
            type = types.get(0);
        if(mScore <= 19 && mScore >= 10)
            type = types.get(1);
        if(mScore <= 29 && mScore >= 20)
            type = types.get(2);
        else
            type = types.get(3);

        return "You have been categorized as " + type;
    }

    @Override
    public String updateScoreboard() {
        mNumRemaining -= 1;
        mQuestionNum += 1;
        return String.format("%d  questions to go",mNumRemaining);
    }

}
