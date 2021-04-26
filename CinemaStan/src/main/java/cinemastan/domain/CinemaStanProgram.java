package cinemastan.domain;

import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class CinemaStanProgram extends Application {
Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        launch(args);         
   }

@Override
   public void start(Stage stage) throws Exception {
       
       System.out.println("You had me at ‘hello’. Welcome to CinemaStan!");
       System.out.println(" ");
       
       while (true) {
           
           System.out.println("What would you like to do next?");
           System.out.println("1) I want to play a game! (Quiz difficulty: easy)");
           System.out.println("2) Danger is my middle name! (Quiz difficulty: difficult)");
           System.out.println("3) Sign me up! (Create account)"); //Database tba
           System.out.println("4) Don't you know who I am? (Log in to your account)"); //Not yet functional
           System.out.println("x) Exit CinemaStan");

           System.out.println(" ");
           String command = this.scanner.nextLine();
           
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                quizEasy();
            } else if (command.equals("2")) {
                quizHard();
            } else if (command.equals("3")) {
                accountCreation();
            } else if (command.equals("4")) {
                accountLogin();
            
            } else {
                System.out.println("Wanna run that by me again, buster?");
            }
        }
       
       System.out.println(goodbyes());

}

    public void quizEasy() {
        System.out.println("Here we go! Hope you're ready.");
        
        Questions quizQuestions = new Questions();
        Quiz easyQuiz = new Quiz(quizQuestions);
        easyQuiz.quizView();
        
    }    
    public void quizHard(){
        System.out.println("Ready or not, here's Johnny!");
    }
    public void accountCreation(){ //Database functions here
        
        System.out.println("Awesome!");
            
            
            System.out.println("Choose a memorable username: ");
            String username = this.scanner.nextLine();
            
            while(true){
                System.out.println("Choose a good password(5-10 characters): ");
                String password = this.scanner.nextLine();
                if(password.length()<5 || password.length()>10){
                System.out.println("Whoops, the password should be 5-10 characters!");
                System.out.println(" ");
                }else{
                    break;
                }
            
            }
            System.out.println(" ");
            System.out.println("Good job, let's get you signed in.");
            
            accountLogin();
            
        }
    
    public void accountLogin(){
        System.out.println(" ");
        
        System.out.println("Username: ");
        String username = this.scanner.nextLine();
            
        System.out.println("Password: ");
        String password = this.scanner.nextLine();
            
        System.out.println("Oh, right this way, please, your booth is ready!");
        System.out.println(" ");
        
    }
    public String goodbyes(){
        Random random = new Random(); //will be used for randomizing an array of goodbyes later
        String one= "Here’s lookin’ at you, kid!";
        /*String two= "Hasta la vista, Baby!";
        String three= "Time to say goodbye, Highlander";*/
        
        return one;
       
    }
}
