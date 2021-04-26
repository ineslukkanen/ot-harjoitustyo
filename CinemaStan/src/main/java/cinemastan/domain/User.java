
package cinemastan.domain;

public class User {
    
    private String username;
    private String password;
    private int score;
    private int correct;

    public User(String username, String password, int score) {
        this.username = username;
        this.password = password;
        this.score = 0;
        this.correct = 0;
        
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public int getScore() {
        return score;
    }
    public void increaseScore(){
        this.score++;
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
