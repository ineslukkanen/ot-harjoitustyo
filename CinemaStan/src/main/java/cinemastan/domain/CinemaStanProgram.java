package cinemastan.domain;

import java.util.*;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CinemaStanProgram extends Application {
Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        launch(args);         
   }

@Override
   public void start(Stage stage) throws Exception {
       
        stage.setTitle("CinemaStan");
        Label greeting = new Label("Welcome to CinemaStan!");
        greeting.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        Questions questions = new Questions();
        
        Quiz quiz = new Quiz(questions);
 
        BorderPane layout = new BorderPane();
 
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button play = new Button("I want to play a game!");
 
        menu.getChildren().addAll(greeting, play);
        layout.setTop(menu);
 
        play.setOnAction((event) -> layout.setCenter(quiz.quizView()));
 
        Scene scene = new Scene(layout, 800, 400);
 
        stage.setScene(scene);
        stage.show();
    }
}
        