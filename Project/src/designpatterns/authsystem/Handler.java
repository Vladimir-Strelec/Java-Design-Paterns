package designpatterns.authsystem;

import java.util.Objects;

public abstract class Handler {
    protected Database database;
    private Handler nextHandler;

    public Handler(Database database) {
        this.database = database;
    }

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public abstract boolean handle(String name, String pass);

    protected boolean callNextHandler(String name, String pass) {
        if(Objects.isNull(this.nextHandler)) {
            return true;
        }
        return nextHandler.handle(name, pass);
    }
}
