package cinemastan.domain;

/**
 *
 * @author inlukkan
 */
import java.util.*;

public class Questions { 

    private final List<Quiz> 
    easyQuestions; 

    public Questions() { 

    this.easyQuestions = addQuestions(); 
    } 
    
    public List<Quiz> getQuestions() {
        return easyQuestions; 
}

    private List<Quiz> addQuestions() {
        
        List<Quiz> easyQuestions = new ArrayList<>(); 
        
        String question = "Which film did Leonardo DiCaprio win his first Oscar for?"; 
        String[] answers1 = { "The Wolf of Wall Street(2013)", "What’s Eating Gilbert Grape(1993)", "Titanic (1997)", "The Revenant (2015)" }; 
        Quiz quizQuestion = new Quiz(question, 3, answers1); 
        this.easyQuestions.add(quizQuestion);  
        
        question = "Who starred alongside Dustin Hoffman in the 1988 classic, Rain Man?"; 
        String[] answers2 = { "Tom Cruise", "Charlie Sheen", "River Phoenix", "Tom Hanks" };
        quizQuestion = new Quiz (question, 0, answers2); 
        this.easyQuestions.add(quizQuestion); 
        
        question = "Which gruesome horror franchise debuted in 2004, starring Cary Elwes and Danny Glover?";  
        String[] answers3 =  { "Saw", "Hostel", "Scream", "Final Destination" }; 
        quizQuestion = new Quiz (question, 0, answers3);
        this.easyQuestions.add(quizQuestion);
        
        question = "A Polish immigrant recounts the story of her heart-wrenching wartime struggles to an enamoured younger man. Name that Meryl Streep film! ";
        String[] answers4 = { "Doubt (2008)", "Suffragette (2015)", "Sophie’s Choice (1982)", "The Bridges of Madison County (1995)" }; 
        quizQuestion = new Quiz (question, 1, answers4);
        this.easyQuestions.add(quizQuestion);
        
        question = "Schindler’s list raked in the academy awards in 1993. Who portrayed the titular man, Oscar Schindler?"; 
        String[] answers5 = { "Liam Neeson", "Daniel Day-Lewis", "Geoffrey Rush", "Anthony Hopkins" };
        quizQuestion = new Quiz(question, 0, answers5);
        this.easyQuestions.add(quizQuestion);

        return easyQuestions; 
    } 
}