import cinemastan.domain.CinemaStanMain;
import cinemastan.domain.User;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;


public class UserTest {
    
User newuser;

    public UserTest() {
        
        this.newuser = new User("Staniel", "films98347", 0);
        
    }
    @Test
    public void qetUserNameWorks() {
        String usr = newuser.getUsername();
        assertTrue(newuser.getUsername().equals(usr));    
    }
    
    @Test
    public void getPasswordWorks() {
       String password = newuser.getPassword();
       assertTrue(newuser.getPassword().equals(password));
    }
    
    @Test
    public void getScoreWorks() {
        int score = newuser.getScore();
        assertTrue(newuser.getScore() == score);        
    }
    
    @Test
    public void increasingScoreWorks(){
        newuser.increaseScore();
        assertThat(newuser.getScore(), is(equalTo(1)));
        
    }
    @Test
    public void duplicatesRecognized(){
        this.newuser = new User("Staniel", "films98347", 0);
        assertTrue(newuser.equals(this.newuser));
        
    }
    @Test
    public void nonDuplicatesReturnFalse() {
        User one = new User("Bengela", "123456", 0);
        User two = new User ("Tangela", "654321", 1);
        assertFalse(one.equals(two));
    }
}