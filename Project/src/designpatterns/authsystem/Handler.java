package designpatterns.authsystem;

import java.util.Objects;

public abstract class Handler {
    protected DatabaseClass databaseClass;
    private Handler nextHandler;

    public Handler(DatabaseClass databaseClass) {
        this.databaseClass = databaseClass;

    }

    protected abstract boolean handle(String name, String pass);

    protected boolean callNextHandler(String name, String pass) {
        if (Objects.isNull(this.nextHandler)) {
            return true;
        }
        return nextHandler.handle(name, pass);
    }

    protected void callInterfaceImpl(HandlerInterface handlerInterface) {
        Handler user = new UserExistsHandler(databaseClass);
        Handler password = new ValidPasswordHandler(databaseClass);
        if(user.handle())
    }
}
