package com.example.sabrinapin.multquiz;

/**
 * Created by NiallSchroder on 2/24/18.
 */

public class LinearQuiz extends Quiz implements QuizInterface {

    //TODO change scores from storing in activity main to the quizzes





    public LinearQuiz(String name, Question[] qs) {
        super(name, qs);
    }


    @Override
    public String processResults() {
        return String.format("You got %d of %d right", mScore, this.size());
    }

    @Override
    public String updateScoreboard() {
        mNumRemaining -= 1;
        mQuestionNum += 1;
        return String.format(" %d/%d with %d to go",mScore, this.size(),mNumRemaining);
    }
}
