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
import javafx.geometry.Pos;
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
        Scene startView = new Scene(layout, 1000, 500);
        
/** Sign-up view
 * Sets up the sign-up layout
 */
        
        GridPane signupView = new GridPane();
        signupView.setAlignment(Pos.CENTER);
        signupView.setVgap(10);
        signupView.setHgap(10);

        TextField userName = new TextField();
        TextField userPword = new TextField();
        Label info1 = new Label("Choose a good username: ");
        Label info2 = new Label("Choose a password (at least 8 characters minimum): ");
        Label info3 = new Label("");
        Button go = new Button("Ready!");
       
        info1.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info2.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info3.setFont(Font.font("Calibri", FontWeight.NORMAL, 15));
        
        signupView.add(info1, 3, 3);
        signupView.add(userName, 3, 5);
        signupView.add(info2, 3, 7);
        signupView.add(userPword, 3, 9);
        signupView.add(go, 3, 11);
        signupView.add(info3, 3, 13);

/** Login view
 * Sets up the login layout
 */
        GridPane loginView = new GridPane();
        loginView.setAlignment(Pos.CENTER);
        TextField usrName = new TextField();
        TextField usrPword = new TextField();
        Label info4 = new Label("Username: ");
        Label info5 = new Label("Password: ");
        info4.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info5.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        Label info6 = new Label("");
        Button logIn = new Button("Login");
        
        loginView.add(info4, 0, 0);
        loginView.add(usrName, 0, 1);
        loginView.add(info5, 0, 2);
        loginView.add(usrPword, 0, 3);
        loginView.add(logIn, 0, 4);
        loginView.add(info6, 0, 6);
        
        go.setOnAction((event) ->{
            info3.setText("Sorry, under construction!");
        });    
        logIn.setOnAction((event) ->{
            info6.setText("Sorry, under construction!");
        });    
        exit.setOnAction((event) -> {
            System.exit(0);
        });
        
/** Buttons
 * Functions for the buttons
 */

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
        