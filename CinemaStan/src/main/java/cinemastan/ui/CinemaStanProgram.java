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
import javafx.scene.control.TextField;

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
        
        
        //Sign-up coming here
        
        GridPane signupView = new GridPane();
        TextField userName = new TextField();
        TextField userPword = new TextField();
        Label info1 = new Label("Choose a good username: ");
        Label info2 = new Label("Choose a password (at least 8 characters minimum): ");
        Label info3 = new Label("");
        Button go = new Button("Go!");
       
        info1.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info2.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info3.setFont(Font.font("Calibri", FontWeight.NORMAL, 15));
        
        signupView.add(info1, 0, 0);
        signupView.add(userName, 0, 1);
        signupView.add(info2, 0, 2);
        signupView.add(userPword, 0, 3);
        signupView.add(go, 0, 4);
        signupView.add(info3, 0, 5);

                //Login coming here
        GridPane loginView = new GridPane();
        TextField usrName = new TextField();
        TextField usrPword = new TextField();
        Label info4 = new Label("Username: ");
        Label info5 = new Label("Password: ");
        info4.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        info5.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        Label info6 = new Label("");
        Button logIn = new Button("Login");
        
        loginView.add(info4, 0, 0);
        loginView.add(usrName, 0, 1);
        loginView.add(info5, 0, 2);
        loginView.add(usrPword, 0, 3);
        loginView.add(logIn, 0, 4);
        loginView.add(info6, 0, 5);
        
        go.setOnAction((event) ->{
            info3.setText("Sorry, under construction!");
        });    
        logIn.setOnAction((event) ->{
            info6.setText("Sorry, under construction!");
        });    
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
        