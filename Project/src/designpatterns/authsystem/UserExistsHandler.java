package designpatterns.authsystem;

public class UserExistsHandler extends Handler {

    public UserExistsHandler(Database database) {
        super(database);
    }

    @Override
    public boolean handle(String name, String pass) {
        if(!database.isValidUser(name)) {
            return false;
        }
        return callNextHandler(name, pass);
    }
}
