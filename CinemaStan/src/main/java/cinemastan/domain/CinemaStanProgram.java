package cinemastan.domain;

import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

public class CinemaStanProgram extends Application {

    static void main(String[] args) {
        launch(args);
    }
   
    Scanner scanner = new Scanner(System.in);  
    Quiz quiz;
    int userScore;
   
   public CinemaStanProgram() {  
       this.quiz = new Quiz();
       this.scanner = scanner;
       this.userScore=0;
   }

@Override

   public void start(Stage stage) throws Exception {
       System.out.println("You had me at ‘hello’. Welcome to CinemaStan!");
       System.out.println(" ");
       
       while (true) {
           
           System.out.println("What would you like to do next?");
           System.out.println("1) I want to play a game! (Quiz difficulty: easy)");
           System.out.println("2) Sign me up! (Create account)"); //Database tba
           System.out.println("3) Don't you know who I am? (Log in to your account)"); //Not yet functional
           System.out.println("x) Exit CinemaStan");

           System.out.println(" ");
           String command = this.scanner.nextLine();
           
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                quizEasy();
            } else if (command.equals("2")) {
                accountCreation();
            } else if (command.equals("3")) {
                accountLogin();
            
            } else {
                System.out.println("Wanna run that by me again, buster?");
            }
        }

       System.out.println("Here’s lookin’ at you, kid");
       //Alternatively “Hasta la vista, baby!” or “Time to say goodbye, Highlander!
}

    private void quizEasy() {
        System.out.println("Here we go! Hope you're ready.");
        System.out.println(" ");
        
        quiz.getQuestion();
               
        /*while (questions <=10) {
           questions 0;
           
           System.out.println(" ");
           String userAnswer = this.scanner.nextLine();
           
            If answer correct
            score++
            questions++
           
            At the end, println You got x out of 10 questions right!
            Your high score has been updated to your account.
        }*/ 
    }
    private void accountCreation(){
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
    
    private void accountLogin(){
        System.out.println(" ");
        
        System.out.println("Username: ");
        String username = this.scanner.nextLine();
            
        System.out.println("Password: ");
        String password = this.scanner.nextLine();
            
        System.out.println("Oh, right this way, please, your booth is ready!");
        System.out.println(" ");
    }
}
