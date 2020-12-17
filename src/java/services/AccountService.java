
package services;

import java.io.Serializable;
import model.User;

/**
 *
 * @author 813116
 */
public class AccountService implements Serializable {
    public User login(String username, String password) {
        if((username.equals("adam") || username.equals("betty")) && password.equals("password")) {
                return new User(username, password);
        }
        return null;
    }
}
