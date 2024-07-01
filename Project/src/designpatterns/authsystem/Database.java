package designpatterns.authsystem;

import java.util.Map;
import java.util.Objects;

public class Database {
    private Map<String, String> users;

    public Database(Map<String, String> users){
        this.users = users;
    }

    public boolean isValidUser(String name) {
        return true;
    }
}
