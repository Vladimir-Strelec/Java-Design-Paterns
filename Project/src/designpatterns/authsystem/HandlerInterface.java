package designpatterns.authsystem;

public interface HandlerInterface {
    void validNameAndPass();
    void wrongPassword();
    void userNotFound();
}
