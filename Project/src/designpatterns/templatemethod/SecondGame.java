package designpatterns.templatemethod;

public class SecondGame extends Game{
    @Override
    void theGameHasStarted() {
        System.out.println("The "+this.getClass().getSimpleName()+" has started");
    }
    @Override
    void theGameHasFinished() {
        System.out.println("***GAME OVER!***");
    }
}
