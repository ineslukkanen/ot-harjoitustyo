package cinemastan.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inlukkan
 */

public class Question { 

    private int correctAnswer; 
    private String question; 
    private String[] answers; 

    public Question(String question, int correctAnswer, String... answers) { //var args <3
        this.question = question; 
        this.answers = answers; 
        this.correctAnswer = correctAnswer; 

    } 
    public String[] getAnswers() { 

        return answers; 

    } 

    public String getQuestion() { 

        return question; 
    } 


    public String getCorrectAnswer() { 

        return answers[correctAnswer]; 
        } 
    }

