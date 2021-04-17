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

public class Quiz { 

    private String question; 
    private int correctAnswer; 
    private String[] answers; 

    public Quiz(String question, int correctAnswer, String... answers) { //var args <3
        this.question = question; 
        this.answers = answers; 
        this.correctAnswer = correctAnswer; 

    } 

    Quiz() {
        
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
    
    @Override
    public String toString() {
        return this.question + ": " + this.answers;
    }
}
