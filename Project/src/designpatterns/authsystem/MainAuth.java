package designpatterns.authsystem;

import java.util.HashMap;
import java.util.Map;

public class MainAuth {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("user1", "12345");
        users.put("user2", "98765");

        Database database = new Database(users);

        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database));



        AuthService service = new AuthService(handler);
        service.login("user1", "12345");






    }
}
