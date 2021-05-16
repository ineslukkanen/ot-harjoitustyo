package database;

/**
 * Controller class for user data utilities
 * 
 * @author inlukkan
 */

public class Controller {
 
	private UsrDAO userDao;
	private CreateDatabase createdDb;
 
	public Controller(String database) {
    	this.userDao = new UsrDAO(database);
    	this.createdDb = new CreateDatabase();
 
    	createdDb.setupDatabase(database);
	}
        
        /**
         * Prompts user creation into the database
         * 
         * @param user 
         */
        
    public void createNewUser(User user) {
    	userDao.create(user);

	}
                
        /**
         * Queries whether a specific user already exists
         * 
         * @param username
         * @param password
         * @return true if existing data is found, and otherwise returns false
         */
        
	public Boolean existingUserQuery(String username, String password) {
    	User user = userDao.findUser(username, password);
 
    	if (user.getUsername() == null || user.getPassword() == null) {
        	return false;
    	}
    	return true;
	}
	
         /**
         * userID getter
         * 
         * @param username
         * @param password
         * @return userID 
         */
	public int getUserID(String username, String password) {
    	
    	User user = userDao.findUser(username, password);
    	int userID = user.getUserID();
    	return userID;
	}

}
