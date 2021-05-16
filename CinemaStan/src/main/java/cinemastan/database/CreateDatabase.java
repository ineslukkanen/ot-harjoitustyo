
package cinemastan.database;

/**
 *
 * @author inlukkan
 */

import cinemastan.ui.CinemaStanProgram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

   
public class CreateDatabase {  
  
    public CreateDatabase() {
	
    }
    /**
     * Setting up the database 
     */
    
	public void setupDatabase(String database) {

    	try {
        	Connection conn = connect(database);
        	PreparedStatement setupDatabase = conn.prepareStatement(
                	"CREATE TABLE IF NOT EXISTS Users(userName TEXT, password TEXT, PRIMARY KEY(userID));");
        	setupDatabase.execute();
        	setupDatabase.close();
 
    	} catch (SQLException ex) {
        	Logger.getLogger(CinemaStanProgram.class
                    .getName()).log(Level.SEVERE, null, ex);
    	}
    }
        
    /**
     * 
     * Connects into the database
     * @return connection 
     */    
	private Connection connect(String database) {
    	Connection connection = null;
    	try {
        	String url = "jdbc:sqlite:" + database;
        	connection = DriverManager.getConnection(url);
    	} catch (SQLException e) {
        	System.out.println(e.getMessage());
    	}
    	return connection;
	}
}

