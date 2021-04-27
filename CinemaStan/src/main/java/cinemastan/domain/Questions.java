package cinemastan.domain;

import java.util.*;
import cinemastan.ui.CinemaStanProgram;

public class Questions { 
 
    private List<String> questions;
    private Map<String, String> correctAnswer;
 
    public Questions() {
        this.questions = new ArrayList<>();
        this.correctAnswer = new HashMap<>();
        
        addQuestion("Which film did Leonardo DiCaprio win his first Oscar for?\n  \n A) The Wolf of Wall Street(2013) \n B) What’s Eating Gilbert Grape(1993) \n C) Titanic (1997) \n D) The Revenant (2015)", "D");
        addQuestion("Who starred alongside Dustin Hoffman in the 1988 classic, Rain Man?\n  \n A)Tom Cruise \n B) Charlie Sheen \n C) River Phoenix \n D) Tom Hanks", "A");
        addQuestion("Which gruesome horror franchise debuted in 2004, starring Cary Elwes and Danny Glover?\n  \n A) Saw \n B) Hostel \n C) Scream \n D) Final Destination", "A");
        addQuestion("A Polish immigrant recounts the story of her heart-wrenching wartime struggles to an enamoured younger man.\n  \n Name that Meryl Streep film! \n A) Doubt (2008) \n B) Suffragette (2015) \n C) Sophie’s Choice (1982) \n D) The Bridges of Madison County (1995)", "C");
        addQuestion("Schindler’s list raked in the academy awards in 1993. Who portrayed the titular man, Oscar Schindler?\n \n A) Liam Neeson \n B) Daniel Day-Lewis \n C) Geoffrey Rush \n D) Anthony Hopkins", "A");
        addQuestion("Which of these movies was not directed by Steven Spielberg?\n \n A) E.T. (1982) \n B) Hook (1991) \n C) Jurassic Park (1993) \n D) Taxi Driver (1976)", "D");
        addQuestion("This 1995 Kevin Costner movie ended up one of the most expensive flops in cinematic history. What was it?\n  \n A) The Postman \n B) Dances With the Wolves \n C) Waterworld \n D) The Guardian", "C");
        addQuestion("Anthony Hopkins immortalized the iconic character of Hannibal Lecter in the 1991 thriller, Silence of the Lambs.\n  \n But who played the main protagonist, Agent Clarice Starling, opposite him? \n A) Sandra Bullock \n B) Jodie Foster \n C) Kim Basinger \n D) Julianne Moore", "B");
        addQuestion("The 2018 biographical movie about the rock band Queen starred Rami Malek as Farrokh Bulsara, better known as \n Freddie Mercury. What was the title? \n \n A) Don’t Stop Me Now \n B) Bohemian Rhapsody \n C) Queen \n D) The Show Must Go On", "B");
        addQuestion("Which 2008 film ended up earning Heath Ledger more than 30 posthumous accolades for his performance?\n  \n A) The Dark Knight \n B) Casanova \n C) Brokeback Mountain \n D) Monster’s Ball", "A");
        addQuestion("Actress Scarlet Johansson and director Taika Waititi are no strangers to the Marvel Cinematic Universe. \n What was their first non-Marvel movie together? \n  \n A) What We Do in the Shadows \n B) Lost in Translation \n C) Her \n D) Jojo Rabbit", "D");
        addQuestion("What was the first 3D-animated full-length feature film released by Pixar in 1996?\n  \n A) A Bug’s Life \n B) None; they didn’t release a film until 1997 \n C) Toy Story \n D) Shrek", "C");
        addQuestion("Which 1991 comedy, starring, among others, Raul Julia and Anjelica Huston, featured Christina Ricci \n in her breakout role as Wednesday? \n  \n A) Mermaids \n B) Casper \n C) The Addams Family \n D) Sleepy Hollow", "C");
        addQuestion("We met the Sanderson sisters, Winifred, Sarah and Mary in the beloved 1993 Halloween classic,\n “Hocus Pocus”. Who played the formidable Winifred Sanderson? \n \n\n A) Barbara Streisand \n B) Goldie Hawn \n C) Sarah Jessica Parker \n D) Bette Midler", "D");
        addQuestion("In this 2003 comedy, Jack Black takes on the role of Dewey Finn, an accidental substitute music teacher \n with big dreams of stardom. Name the movie! \n \n A) School of Rock \n B) High Fidelity \n C) Tenacious D in the Pick of Destiny \n D) Old School", "A");
    
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
