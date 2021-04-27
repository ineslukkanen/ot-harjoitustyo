package cinemastan.domain;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import cinemastan.ui.CinemaStanProgram;


public class Quiz { 

    private Questions quizQuestions;
    private String question;
 
    public Quiz(Questions quizQuestions) {
        this.quizQuestions = quizQuestions;
        this.question = quizQuestions.askQuestion();
    }
 
    public Parent quizView() {
        GridPane setup = new GridPane();
 
        Label questionLabel = new Label(this.question);
        TextField answerField = new TextField();
 
        setup.setAlignment(Pos.CENTER);
        setup.setVgap(10);
        setup.setHgap(10);
        setup.setPadding(new Insets(10, 10, 10, 10));
 
        Button go = new Button("Go!");
        Label check = new Label("");
 
        setup.add(go, 0, 3);
        setup.add(answerField, 0, 4);
        setup.add(check, 0, 2);
        setup.add(questionLabel, 0, 1);
        go.setOnMouseClicked((event) -> {
            String answer = answerField.getText();
            if (quizQuestions.getQuestion(question).equals(answer)) {
                check.setText("Correct!");
            } else {
                check.setText("Wrong! The correct answer was " + quizQuestions.getQuestion(question) + "'.");
                return;
            }
 
            this.question = this.quizQuestions.askQuestion();
            questionLabel.setText(this.question);
            answerField.clear();
 
        });
 
        return setup;
    }
}
