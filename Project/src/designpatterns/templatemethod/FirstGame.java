package designpatterns.templatemethod;

public class FirstGame extends Game{
    @Override
    public void theGameHasStarted() {
        System.out.println("The game has started");
    }
    @Override
    public void theGameHasFinished() {
        System.out.println("The game has finished");
    }
}
