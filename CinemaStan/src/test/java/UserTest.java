
import database.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest {
    
User newuser;

    public UserTest() {
        
        this.newuser = new User(1, "Staniel", "films98347");
        
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
    public void getUserIDWorks(){
        int ID = newuser.getUserID();
        assertTrue(newuser.getUserID()==ID);
    }

    @Test
    public void duplicatesRecognized(){
        this.newuser = new User(1, "Staniel", "films98347");
        assertTrue(newuser.equals(this.newuser));
        
    }
    @Test
    public void setUserNameWorks() {
        this.newuser.setUsername("Daniel");
        assertTrue(newuser.getUsername().equals(this.newuser.getUsername()));
    }
    @Test
    public void setPasswordWorks() {
        this.newuser.setPassword("films98347");
        assertTrue(newuser.getPassword().equals(this.newuser.getPassword()));
    }
    @Test
    public void setUserID() {
        this.newuser.setUserID(1);
        assertTrue(newuser.getUserID()==this.newuser.getUserID());
    }
    @Test
    public void nonDuplicatesReturnFalse() {
        User one = new User(2, "Bengela", "123456");
        User two = new User (3, "Tangela", "654321");
        assertFalse(one.equals(two));
    }
}