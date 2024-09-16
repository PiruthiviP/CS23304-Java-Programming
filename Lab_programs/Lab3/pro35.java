/*Create a class called UserLogin with username, and password. Create methods:
validateUsername() and validatePWD() to check if the username and password are valid or
not. Create an array of 5 Login credentials and initialize using constructors. All 5 users must
try to login with their credentials (use a loop through the array). If the username does not exist
“Username invalid“message should be displayed. If the username is correct, but the password
is incorrect, “password does not match the username” message must be displayed. If both
are correct, “Successful login by username _____” message must be displayed.  */

class UserLogin {
    String username;
    String password;

    UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean validateUsername(String u) {
        return u.equals(username);
    }

    boolean validatePWD(String p) {
        return p.equals(password);
    }
}

public class pro35 {
    public static void main(String[] args) {
        
        UserLogin[] users = new UserLogin[5];

        users[0] = new UserLogin("abcd", "1234");
        users[1] = new UserLogin("bcda", "5678");
        users[2] = new UserLogin("cdab", "9012");
        users[3] = new UserLogin("dabc", "3456");
        users[4] = new UserLogin("efgh", "7890");

       
        for (UserLogin user : users) {
            String username = user.username;
            String password = user.password;

            
            if (user.validateUsername(username) && user.validatePWD(password)) {
                System.out.println("Successful login by username " + username);
            } else {
                
                if (!user.validateUsername(username)) {
                    System.out.println("Username invalid");
                } else if (!user.validatePWD(password)) {
                    System.out.println("Password does not match the username");
                }
            }
        }
    }
}