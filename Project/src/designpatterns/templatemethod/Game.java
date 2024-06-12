package designpatterns.templatemethod;

public abstract class Game {
    private String p1;
    private String p2;
    private String p3;



    abstract void theGameHasStarted();
    abstract void theGameHasFinished();

    public void welcome() {
        System.out.println("You are welcome");
    }

    public void EnterPlayer(String name) {
        System.out.println("Player: "+name+" entered");
    }

    public void LeavePlayer(String name) {
        System.out.println("Player: "+name+" leaved");
    }

    public void makeGame(String p1, String p2, String p3) {
        this.welcome();
        this.theGameHasStarted();
        this.EnterPlayer(p1);
        this.EnterPlayer(p2);
        this.LeavePlayer(p1);
        this.EnterPlayer(p3);
        this.LeavePlayer(p2);
        this.LeavePlayer(p3);
        this.theGameHasFinished();

    }

}
