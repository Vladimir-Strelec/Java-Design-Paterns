package designpatterns.authsystem;

public class ValidPasswordHandler extends Handler{
    public ValidPasswordHandler(DatabaseClass databaseClass) {
        super(databaseClass);
    }

    @Override
    protected boolean handle(String name, String pass) {
        return databaseClass.isValidUser(name, pass);
    }
}
