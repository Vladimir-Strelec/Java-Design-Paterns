package designpatterns.authsystem;

public class ValidPasswordHandler extends Handler{
    public ValidPasswordHandler(Database database) {
        super(database);
    }

    @Override
    public boolean handle(String name, String pass) {
        return false;
    }
}
