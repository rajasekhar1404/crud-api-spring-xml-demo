package org.dao;

import org.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserDAO {

    private HashMap<String, User> users;
    public UserDAO() {
        users = new HashMap<>();
        User user1 = new User();
        user1.setLastName("Rajasekhar");
        user1.setLastName("Karampudi");

        User user2 = new User();
        user2.setFirstName("Raj");
        user2.setLastName("kumar");

        users.put("1", user1);
        users.put("2", user2);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for(String key : this.users.keySet()) {
            users.add(this.users.get(key));
        }
        return users;
    }

}