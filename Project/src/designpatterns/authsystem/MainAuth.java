package designpatterns.authsystem;

import java.util.HashMap;
import java.util.Map;

public class MainAuth {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("user1", "12345");
        users.put("user2", "98765");

        DatabaseClass databaseClass = new DatabaseClass(users);





    }
}
