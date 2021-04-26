package cinemastan.domain;

/**
 *
 * @author inlukkan
 */
import java.util.*;

public class Questions { 
 
    private List<String> questions;
    private Map<String, String> correctAnswer;
 
    public Questions() {
        this.questions = new ArrayList<>();
        this.correctAnswer = new HashMap<>();
        
        addQuestion("Which film did Leonardo DiCaprio win his first Oscar for? A) The Wolf of Wall Street(2013) B) What’s Eating Gilbert Grape(1993) C) Titanic (1997) D) The Revenant (2015)\" ", "D");
        addQuestion("Who starred alongside Dustin Hoffman in the 1988 classic, Rain Man? A)Tom Cruise B) Charlie Sheen C) River Phoenix D) Tom Hanks", "A");
        addQuestion("Which gruesome horror franchise debuted in 2004, starring Cary Elwes and Danny Glover? A) Saw B) Hostel C) Scream D) Final Destination", "A");
        addQuestion("A Polish immigrant recounts the story of her heart-wrenching wartime struggles to an enamoured younger man. Name that Meryl Streep film! A) Doubt (2008) B) Suffragette (2015) C) Sophie’s Choice (1982) D) The Bridges of Madison County (1995)", "C" );
        addQuestion("Schindler’s list raked in the academy awards in 1993. Who portrayed the titular man, Oscar Schindler? A) Liam Neeson B) Daniel Day-Lewis C) Geoffrey Rush D) Anthony Hopkins", "A");
    }
 
    public String getQuestion(String question) {
        return this.correctAnswer.get(question);
    }
 
    public void addQuestion(String question, String correctAnswer) {
        if (!this.correctAnswer.containsKey(question)) {
            this.questions.add(question);
        }
 
        this.correctAnswer.put(question, correctAnswer);
    }
 
    public String askQuestion() {
        Random random = new Random();
        return this.questions.get(random.nextInt(this.questions.size()));
    
    }
}
