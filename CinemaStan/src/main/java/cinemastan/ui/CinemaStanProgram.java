package cinemastan.ui;

import cinemastan.domain.Questions;
import cinemastan.domain.Quiz;
import cinemastan.database.Controller;
import cinemastan.database.User;
import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class CinemaStanProgram extends Application {
    Scanner scanner = new Scanner(System.in);
    private Controller ds = new Controller("db");
    private int loggedIn;
    
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
        Label info2 = new Label("Choose a password (8-10 characters): ");
        Label passwordError = new Label(""); //Täällä on nyt tää bugi
        Button ready = new Button("Ready!");
       
        info1.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        info2.setFont(Font.font("Calibri", FontWeight.BOLD, 15));
        passwordError.setFont(Font.font("Calibri", FontWeight.NORMAL, 15));
        
        signupView.add(info1, 3, 3);
        signupView.add(userName, 3, 5);
        signupView.add(info2, 3, 7);
        signupView.add(userPword, 3, 9);
        signupView.add(ready, 3, 11);
        signupView.add(passwordError, 3, 13);

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
        Label loginError = new Label("");
        Button logIn = new Button("Login");
        
        loginView.add(info4, 0, 0);
        loginView.add(usrName, 0, 1);
        loginView.add(info5, 0, 2);
        loginView.add(usrPword, 0, 3);
        loginView.add(logIn, 0, 4);
        loginView.add(loginError, 0, 6);
           
        
        logIn.setOnAction((event) ->{
            
            String loginUserName = usrName.getText();
            String loginPword = usrPword.getText();
            if (ds.existingUserQuery(loginUserName, loginPword)==true){
                //Login screne tänne
                loggedIn = ds.getUserID(loginUserName, loginPword);
            } else {
                loginError.setText("Looks like that's not right.");
            }
            
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
        ready.setOnAction((event) ->{
            String newUser = userName.getText();
            String newPword = userPword.getText();
            
            int passwordLength = userPword.getText().length();
            
            User thisUser = new User(1, newUser, newPword);
            
           if (newUser.isEmpty() || newPword.isEmpty()) {
               passwordError.setText("Did you fill both fields?");
           } else if (passwordLength < 8 || passwordLength > 10) {
               passwordError.setText("Password should be 8-10 characters!");
           }else{
               ds.createNewUser(thisUser);
               layout.setCenter(loginView);
               
           }

        });                
        stage.setScene(startView);
        stage.show();
       
    }
}
        