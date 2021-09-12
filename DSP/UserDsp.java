package PropertyHunt.DSP;

import PropertyHunt.Controller.pojo.User;
import PropertyHunt.Database.Database;

public class UserDsp {
    public User getUser(String userId) {
        return Database.getUserMap().get(userId);
    }
    public void registerUser(User user) {
        Database.getUserMap().put(user.getUserId(), user);
    }
}
