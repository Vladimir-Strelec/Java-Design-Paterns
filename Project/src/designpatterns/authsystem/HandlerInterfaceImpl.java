package designpatterns.authsystem;

public class HandlerInterfaceImpl implements HandlerInterface{
    @Override
    public void validNameAndPass() {
        System.out.println("You are logged in");
    }

    @Override
    public void wrongPassword() {
        System.out.println("Wrong password");
    }

    @Override
    public void userNotFound() {
        System.out.println("User not found");
    }
}
