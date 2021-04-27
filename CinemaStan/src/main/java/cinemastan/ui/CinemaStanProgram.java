package cinemastan.ui;

import cinemastan.domain.Questions;
import cinemastan.domain.Quiz;
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
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CinemaStanProgram extends Application {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        launch(args);         
    }

    @Override
    public void start(Stage stage) throws Exception {
       
        stage.setTitle("CinemaStan");
        Label greeting = new Label("Welcome to CinemaStan!");
        greeting.setFont(Font.font("Calibri", FontWeight.BOLD, 48));
        Questions questions = new Questions();
        Quiz quiz = new Quiz(questions);
        BorderPane layout = new BorderPane();
 
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button signup = new Button("Sign up");
        Button login = new Button("Log in");
        Button play = new Button("New Game!");
        Button exit = new Button("Quit");
        Button home = new Button("Home");
        
        menu.getChildren().addAll(signup, login, play, exit);
        layout.setCenter(greeting);
        layout.setTop(menu);
        layout.setStyle("-fx-background-color: linear-gradient(#A74AC7, #F660AB)");
        Scene startView = new Scene(layout, 800, 400);
        
        //Login coming here
        GridPane loginView = new GridPane();
        loginView.add(new Label("Sorry, under construction!"), 0, 0);
        loginView.add(home, 1, 1);
        
        //Sign-up coming here
        GridPane signupView = new GridPane();
        signupView.add(new Label("Sorry, under construction!"), 0, 0);
        signupView.add(home, 1, 1);
        
        exit.setOnAction((event) -> {
            System.exit(0);
        });        
        //Play view
        play.setOnAction((event) -> {
            layout.setCenter(quiz.quizView());
        });
        
        login.setOnAction((event) -> {
            layout.setCenter(loginView);
        });
        signup.setOnAction((event) -> {
            layout.setCenter(signupView);
        });
        home.setOnAction((event) -> {
            stage.setScene(startView);
        });                
        stage.setScene(startView);
        stage.show();
    }
   
    @Override
    public void stop() {
       
    }
}
        