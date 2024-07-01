package designpatterns.authsystem;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public void login(String name, String password){
        handler.callNextHandler(name, password);
    }
}
