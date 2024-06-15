package designpatterns.authsystem;

public class UserExistsHandler extends Handler{

    public UserExistsHandler(DatabaseClass databaseClass) {
        super(databaseClass);
    }

    @Override
    public boolean handle(String name, String pass) {
        return this.databaseClass.isValidUser(name);
    }
}
