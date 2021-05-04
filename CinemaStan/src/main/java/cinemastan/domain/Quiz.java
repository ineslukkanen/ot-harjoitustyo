package cinemastan.domain;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import cinemastan.ui.CinemaStanProgram;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * 
 * @author inlukkan
 */

public class Quiz { 

    private Questions quizQuestions;
    private String question;
    private String answer = "";
    User user;
    
 
    public Quiz(Questions quizQuestions) {
        this.quizQuestions = quizQuestions;
        this.question = quizQuestions.askQuestion();
        this.answer = answer;
        this.user = user;
    }
/**
 * Method sets up the quiz view and inspects the user's answer
 * 
 * @return  setup
 * quizView will be broken into two separate methods soon
 */ 
    public Parent quizView() {
        GridPane setup = new GridPane();
 
        Label questionLabel = new Label(this.question);
        questionLabel.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        
        setup.setAlignment(Pos.CENTER);
        setup.setVgap(10);
        setup.setHgap(10);
        setup.setPadding(new Insets(10, 10, 10, 10));
 
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");
        Button D = new Button("D");

        Label check = new Label("");
        check.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        setup.add(check, 0, 1);
        setup.add(questionLabel, 0, 3);
        setup.add(A, 0, 4);
        setup.add(B, 0, 5);
        setup.add(C, 0, 6);
        setup.add(D, 0, 7);
        
        
        A.setOnMouseClicked((event) -> {
        this.answer = "A";
         if (quizQuestions.getQuestion(question).equals(answer)) {
                check.setText("Correct!");
               
            } else {
            check.setText("Game over! Your score was: ");
                return; 
            } 
            this.question = this.quizQuestions.askQuestion();
            questionLabel.setText(this.question);
        
        });    
        B.setOnMouseClicked((event) -> {
        this.answer = "B";
         if (quizQuestions.getQuestion(question).equals(answer)) {
                check.setText("Correct!");
               
            } else {
            check.setText("Game over! Your score was: ");
                return; 
            } 
            this.question = this.quizQuestions.askQuestion();
            questionLabel.setText(this.question);
            
        });    
        C.setOnMouseClicked((event) -> {
        this.answer = "C";
        
        if (quizQuestions.getQuestion(question).equals(answer)) {
                check.setText("Correct!");       
        } else {
            check.setText("Game over! Your score was: ");
                return; 
        } 
            this.question = this.quizQuestions.askQuestion();
            questionLabel.setText(this.question);
        
        });    
        D.setOnMouseClicked((event) -> {
        this.answer = "D";
     
        if (quizQuestions.getQuestion(question).equals(answer)) {
            check.setText("Correct!");
               
        } else {
            check.setText("Game over! Your score was: ");
                return; 
        } 
            this.question = this.quizQuestions.askQuestion();
            questionLabel.setText(this.question);
 
        });
 
        return setup;
    }
}
