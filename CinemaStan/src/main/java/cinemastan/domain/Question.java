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

private final int correctAnswerIndex; 
private final String question; 
private final String[] answers; 

public Question(String question, int correctAnswerIndex, String... answers) { 
    this.question = question; 
    this.answers = answers; 
    this.correctAnswerIndex = correctAnswerIndex; 

} 
public String[] getAnswers() { 

    return answers; 

} 

public String getQuestion() { 

    return question; 
} 


public String getCorrectAnswer() { 

    return answers[correctAnswerIndex]; 
    } 
}

