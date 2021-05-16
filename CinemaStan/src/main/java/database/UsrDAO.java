package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author inlukkan
 */

public class UsrDAO implements DAO<User, Integer> {
    
    private final String database;
        
    public UsrDAO(String database) {
    	this.database = database; 
	}
    
    /**
     * Creating a new user for the program
     * 
     * @param user 
     */
    
    @Override
    public void create(User user) {
        Connection conn = connect();
 
        try {
            PreparedStatement newUser = conn.prepareStatement("INSERT INTO Users(userID, username, password)"
   	             + " VALUES (?, ?, ?);");
 
            newUser.setInt(1, user.getUserID());
            newUser.setString(2, user.getUsername());
            newUser.setString(3, user.getPassword());
            
            newUser.executeUpdate();
            newUser.close();
    	} catch (SQLException ex) {
            Logger.getLogger(UsrDAO.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    /**
     * Finds the user from the database
     * 
     * @param username
     * @param password
     * @return user
     */
    
    public User findUser(String username, String password) {
        int databUserID = 1;
        String databUsername = null;
        String databPassword = null;
        User searchUser = new User(databUserID, databUsername, databPassword);
 
    	try {
            Connection conn = connect();
            PreparedStatement findUser = conn.prepareStatement("SELECT username, password FROM Users WHERE username = ? AND password = ?;");
            findUser.setString(1, username);
            findUser.setString(2, password);
            ResultSet rs = findUser.executeQuery();
            while (rs.next()) {
                int searchUID = rs.getInt("userID");
                String searchUN = rs.getString("username");
                String searchPW = rs.getString("password");
                
                if (searchUN.equals(username) && searchPW.equals(password)) {
                    searchUser.setUsername(username);
                    searchUser.setPassword(password);
                    searchUser.setUserID(searchUID);
                }
            }
            rs.close();
            conn.close();

    	} catch (SQLException ex) {
            Logger.getLogger(UsrDAO.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	return searchUser;
	}
 	
	
    public User read(Integer key) {
        try {
            Connection conn = connect();
            PreparedStatement readUser = conn.prepareStatement("SELECT * FROM Users WHERE userID = ?;");
            readUser.setInt(1, key);
            ResultSet results = readUser.executeQuery();
 
            if (!results.next()) {
                return null;
            }
            User user = new User(results.getInt("userID"), results.getString("username"), results.getString("password"));
 
            readUser.close();
            results.close();
            conn.close();
            return user;
    	} catch (SQLException ex) {
            Logger.getLogger(UsrDAO.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	return null;
	}
	
    /**
     * Connects to the database
     * @return connection
     */
 	
    private Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:" + database;
            conn = DriverManager.getConnection(url);
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
    	}
    	return conn;
	}
}
