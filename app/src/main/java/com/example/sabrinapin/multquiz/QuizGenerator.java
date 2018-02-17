package com.example.sabrinapin.multquiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by NiallSchroder on 2/17/18.
 */

public class QuizGenerator {

    private static final String DEFAULTQ = "misc"; //key to access default quiz
    private static Map<String,Quiz> muhQuizzes; //map of quizzes, once generated super easy to access all quizzes

    static {
        muhQuizzes = new HashMap<>();
        createRandQuiz();
        createSongQuiz();
    }

    private static void createRandQuiz()  {

        TreeMap<String, Integer> q1 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q2 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q3 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q4 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q5 = new TreeMap<String, Integer>();


        q1.put("James Monroe", 1);
        q1.put("Benjamin Franklin", 0);
        q1.put("Guy Fieri", 0);
        q1.put("Andrew Jackson", 0);

        q2.put("#DA6B2F", 0);
        q2.put("#001A57", 1);
        q2.put("#008080", 0);
        q2.put("#9da99b", 0);

        q3.put("A Hard Day's Night", 0);
        q3.put("The Beatles", 0);
        q3.put("Rubber Soul", 0);
        q3.put("Please Please Me", 1);

        q4.put("13", 0);
        q4.put("23", 1);
        q4.put("25", 0);
        q4.put("36", 0);

        q5.put("Duke Gardens", 0);
        q5.put("Gardens of Versailles", 0);
        q5.put("Hanging Gardens of Babylon", 1);
        q5.put("Keukenhof", 0);


        Question[] list = {
                new Question("Who was the fifth president of the United States", q1),
                new Question("What is the hex value of Duke Blue", q2),
                new Question("What is the name of the Beatles' first album", q3),
                new Question("How many WWE championships has John Cena won", q4),
                new Question("Which garden is considered to be among the Seven Wonders of the World", q5)


        };

        Quiz q = new Quiz("misc",list);
        muhQuizzes.put(q.getTitle(), q);
    }

    private static void createSongQuiz() {
        TreeMap<String, Integer> q1 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q2 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q3 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q4 = new TreeMap<String, Integer>();
        TreeMap<String, Integer> q5 = new TreeMap<String, Integer>();


        q1.put("2011", 0);
        q1.put("2012", 0);
        q1.put("2013", 1);
        q1.put("2017", 0);

        q2.put("2012", 1);
        q2.put("1776", 0);
        q2.put("2014", 0);
        q2.put("2011", 0);

        q3.put("Katy Perry", 0);
        q3.put("Carly Rae Jepson", 1);
        q3.put("Adele", 0);
        q3.put("Ellie Goulding", 0);

        q4.put("Maroon 5", 0);
        q4.put("Ed Sheeran", 0);
        q4.put("Taylor Swift", 0);
        q4.put("Justin Bieber", 1);

        q5.put("Robert Plant", 1);
        q5.put("Bobby Herb", 0);
        q5.put("Guy Fieri", 0);
        q5.put("Owen Astrachan", 0);


        Question[] list = {
                new Question("What year was Thrift Shop the top song", q1),
                new Question("What year did Gotye have a top song", q2),
                new Question("Who wrote and sang Call Me Maybe", q3),
                new Question("Who had two songs in top 5 across 2014-2016", q4),
                new Question("Who was the lead vocalist in Led Zeppelin", q5)


        };

        Quiz q = new Quiz("misc",list);
        muhQuizzes.put(q.getTitle(), q);
    }

    public static Quiz getQuiz(String s) {
        if (muhQuizzes.containsKey(s)) { //if we got it, get it
            return muhQuizzes.get(s);
        }
        for(String ss : muhQuizzes.keySet()){ // if we dont, just grab whatever quiz is there
            return muhQuizzes.get(ss);
        }

        return null; //shoot we didn't find ANY quizzes
    }

    public static Quiz getQuiz(){
        return getQuiz(DEFAULTQ);
    }

    public static String[] getQuizTitles(){
        Set<String> titles = muhQuizzes.keySet();
        return titles.toArray(new String[0]);
    }

}


