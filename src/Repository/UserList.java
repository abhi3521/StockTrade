package Repository;

import Entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserList {

    private Map<Long, User> userMap = new HashMap<>();

    private void addToUser() {
        User u1 = new User(1L, "u1", 0.0);
        User u2 = new User(2L, "u2", 0.0);
        User u3 = new User(3L, "u3", 0.0);
        userMap.put(u1.getId(), u1);
        userMap.put(u2.getId(), u2);
        userMap.put(u3.getId(), u3);
    }

    public User getUserByUserId(Long id) {
        return userMap.get(id);
    }
}
