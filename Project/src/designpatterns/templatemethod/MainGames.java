package designpatterns.templatemethod;

public class MainGames {
    public static void main(String[] args) {
        Game g1 = new FirstGame();
        g1.makeGame("Vova", "Volodya", "Alina");

        System.out.println("______________________________");

        Game g2 = new SecondGame();
        g2.makeGame("Vova", "Volodya", "Alina");

    }
}
