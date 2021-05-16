import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cinemastan.database.UsrDAO;
import cinemastan.database.User;
import cinemastan.database.Controller;

/**
 *
 * @author inlukkan
 */
public class ControllerTest {
    
    User newuser;
    Controller newController;
    
    @Before
    public void setUp() {
        
    this.newuser = new User(1, "Staniel", "films98347");
    newController = new Controller("");
    
    }
    @Test
    public void existingUserQueryWorks(){
        newController.createNewUser(newuser);
        newController.existingUserQuery(newuser.getUsername(), newuser.getPassword());
        User userone = new User(1, "Staniel", "films98347");
        assertEquals(newuser, userone);
        User usertwo = new User (3, "Tangela", "654321");
        assertNotEquals(newuser, usertwo);
        
    }
    /*@Test
    public void createNewUserWorks(){
        
    }*/
    @Test
    public void getUserIDWorks() {
        int userID1 = 1;
        int userID2 = 2;
        userID2 = newController.getUserID(newuser.username, newuser.password);
        assertEquals(userID1, userID2);

    }
}
