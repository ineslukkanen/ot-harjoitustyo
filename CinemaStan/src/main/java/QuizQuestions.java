/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inlukkan
 */
import java.util.ArrayList; 
import java.util.List; 

public class QuizQuestions { 

private List<Question> quizQuestions; 

public QuizQuestions() { 

this.quizQuestions = addQuizQuestions(); 

} 

public List<Question> getQuizQuestions() { 
return quizQuestions; 
} 

private List<Question> addQuizQuestions() { 

List<Question> quizQuestions = new ArrayList<>(); 
String question1 = "Which film did Leonardo DiCaprio win his first Oscar for?"; 
String[] answers1 = { "The Wolf of Wall Street(2013)", "What’s Eating Gilbert Grape(1993)", "Titanic (1997)", "The Revenant (2015)" };
Question question = new Question(question, 3, answers1);
this.quizQuestions.add(Question); 

String question2 = "Who starred alongside Dustin Hoffman in the 1988 classic, Rain Man?"; 
String[] answers2 = { "Tom Cruise", "Charlie Sheen", "River Phoenix", "Tom Hanks" };
QuizQuestion = new QuizQuestion(question, 0, answers2);
this.quizQuestions.add(quizQuestion);

String question3 = "Which gruesome horror franchise debuted in 2004, starring Cary Elwes and Danny Glover?"; 
String[] answers3 = { "Saw", "Hostel", "Scream", "Final Destination" };
quizQuestion = new QuizQuestion(question, 0, answers3);
this.quizQuestions.add(quizQuestion);

String question4 = "A Polish immigrant recounts the story of her heart-wrenching wartime struggles to an enamoured younger man. Name that Meryl Streep film! "; 
String[] answers4 = { "Doubt (2008)", "Suffragette (2015)", "Sophie’s Choice (1982)", "The Bridges of Madison County (1995)" };
quizQuestion = new QuizQuestion(question, 1, answers4);
this.quizQuestions.add(quizQuestion);

question = "Schindler’s list raked in the academy awards in 1993. Who portrayed the titular man, Oscar Schindler?"; 
String[] answers5 = { "Liam Neeson", "Daniel Day-Lewis", "Geoffrey Rush", "Anthony Hopkins" };
quizQuestion = new QuizQuestion(question, 0, answers5);
this.quizQuestions.add(quizQuestion);

// Add the remainder of the questions and answers here 
return quizQuestions; 
} 
}
