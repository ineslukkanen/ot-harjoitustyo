
package cinemastan.domain;

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

public class CinemaStanMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        QuizQuestions quizquestions = new QuizQuestions();
        new CinemaStanProgram(scanner, quizquestions).start();
     
    }
}
