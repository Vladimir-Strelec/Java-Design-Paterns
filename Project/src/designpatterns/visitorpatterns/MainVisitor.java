package designpatterns.visitorpatterns;

public class MainVisitor {
    public static void main(String[] args) {
        Client shop = new Shop("Producti", "Heistershtrase 22", 22);
        shop.printInfo();

        Client restaurant = new Restaurant("Resty", "Nurnberg str. 23", true);
        restaurant.printInfo();

        Client bank = new Bank("Bank", "Bohlenplatz 5", 4);
        bank.printInfo();
    }
}
