/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inlukkan
 */
import java.util.*;

public class CinemaStanProgram {
    
    
   private Scanner scanner;
   
   
   public CinemaStanProgram(Scanner scanner) {
   }


   public void start() {
       while (true) {
           System.out.println("You had me at ‘hello’. Welcome to CinemaStan!");
           System.out.println("What would you like to do?");
           System.out.println("1) I want to play a game! (Quiz difficulty: easy)");
//System.out.println("2) Sign me up! (Create account)");
//System.out.println("3)  (Log in to your account)");


           System.out.println("x) Exit CinemaStan");


           System.out.print("> ");
           String command = this.scanner.nextLine();
           if (command.equals("x")) {
               break;
           }


           // toteuta toiminnallisuus tänne
           if (command.equals("1")) {
            //quizEasy();
           //} else if (command.equals("2")) {
           //    createAccount();
          // } else if (command.equals("3")) {
            //   login();
           }
       }


       System.out.println("Here’s lookin’ at you, kid");
//Alternatively “Hasta la vista, Baby!” or “Time to say goodbye, Highlander!
   }

/*   private void quizEasy() {

    QuizQuestions
    
    String useranswer1 = this.scanner.nextLine();
    if(useranswer1.equals.getCorrectAnswer()){
    easyScore++;
    }else{
        break;
}
System.out.println(“You got a score of “ + easyScore + “!”);
*/    
}
