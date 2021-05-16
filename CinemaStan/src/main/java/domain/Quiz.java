package domain;

import database.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
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
 * 
 */ 
    public Parent quizView() {
        GridPane setup = new GridPane();
 
        Label questionLabel = new Label(this.question);
        questionLabel.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        
        setup.setAlignment(Pos.CENTER);
        setup.setVgap(10);
        setup.setHgap(10);
        setup.setPadding(new Insets(10, 10, 10, 10));
 
        Button a = new Button("A");
        Button b = new Button("B");
        Button c = new Button("C");
        Button d = new Button("D");

        Label check = new Label("");
        check.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        setup.add(check, 0, 1);
        setup.add(questionLabel, 0, 3);
        setup.add(a, 0, 4);
        setup.add(b, 0, 5);
        setup.add(c, 0, 6);
        setup.add(d, 0, 7);
        
        
        a.setOnMouseClicked((event) -> {
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
        b.setOnMouseClicked((event) -> {
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
        c.setOnMouseClicked((event) -> {
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
        d.setOnMouseClicked((event) -> {
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
