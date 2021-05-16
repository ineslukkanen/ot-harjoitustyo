
package cinemastan.database;

/**
 * Program user class
 * 
 * @author inlukkan
 */

public class User {
    
    public int userID;
    public String username;
    public String password;
    
    public User(int userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
                
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        
        User other = (User) obj;
        return username.equals(other.username);
    }
}
