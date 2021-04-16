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
  
   
   public CinemaStanProgram() {  
       this.scanner = scanner;
   }

@Override

   public void start(Stage stage) throws Exception {
       while (true) {
           System.out.println("You had me at ‘hello’. Welcome to CinemaStan!");
           System.out.println("What would you like to do?");
           System.out.println("1) I want to play a game! (Quiz difficulty: easy)");
           System.out.println("2) Sign me up! (Create account)"); //Not yet functional
           System.out.println("3) (Log in to your account)"); //Not yet functional
           System.out.println("x) Exit CinemaStan");

           System.out.print(" ");
           String command = this.scanner.nextLine();
           
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                quizEasy();
            } else if (command.equals("2")) {
                System.out.println("Nice try, come back later!");
            } else if (command.equals("3")) {
                System.out.println("Nice try, come back later!");
            
            } else {
                System.out.println("Wanna run that by me again, buster?");
            }
        }

       System.out.println("Here’s lookin’ at you, kid");
       //Alternatively “Hasta la vista, Baby!” or “Time to say goodbye, Highlander!
}

    private void quizEasy() {
        
        System.out.println("Under construction!");
        
    }
}
