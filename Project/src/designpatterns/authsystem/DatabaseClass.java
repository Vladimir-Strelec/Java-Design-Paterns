package designpatterns.authsystem;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseClass {
    protected Map<String, String> dataBase;

    public DatabaseClass(Map<String, String> dataBase) {
        this.dataBase = dataBase;
    }

    protected boolean isValidUser(String name, String pass) {
        for (String s: dataBase.keySet()) {
            if (s.equals(name)&&s.equals(pass)) {
                return true;
            }
        }
        return false;
    }
}
