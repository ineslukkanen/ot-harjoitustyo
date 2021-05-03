package cinemastan.domain;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import cinemastan.ui.CinemaStanProgram;


public class Quiz { 

    private Questions quizQuestions;
    private String question;
    private String answer = "";
 
    public Quiz(Questions quizQuestions) {
        this.quizQuestions = quizQuestions;
        this.question = quizQuestions.askQuestion();
        this.answer = answer;
    }
 
    public Parent quizView() {
        GridPane setup = new GridPane();
 
        Label questionLabel = new Label(this.question);
 
        setup.setAlignment(Pos.CENTER);
        setup.setVgap(10);
        setup.setHgap(10);
        setup.setPadding(new Insets(10, 10, 10, 10));
 
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");
        Button D = new Button("D");

        Label check = new Label("");
        
        setup.add(questionLabel, 0, 1);
        setup.add(A, 0, 2);
        setup.add(B, 0, 3);
        setup.add(C, 0, 4);
        setup.add(D, 0, 5);
        setup.add(check, 0, 6);
        
        A.setOnMouseClicked((event) -> {
        this.answer = "A";
        
        /*});    
        B.setOnMouseClicked((event) -> {
        this.answer = "B";
        });    
        C.setOnMouseClicked((event) -> {
        this.answer = "C";
        });    
        D.setOnMouseClicked((event) -> {
        this.answer = "D";
        */    
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
