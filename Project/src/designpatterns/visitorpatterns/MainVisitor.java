package designpatterns.visitorpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {
        Client shop = new Shop("Producti", "Heistershtrase 22", 22);
        Client restaurant = new Restaurant("Resty", "Nurnberg str. 23", true);
        Client bank = new Bank("Bank", "Bohlenplatz 5", 4);

        List<Client> clientList = Arrays.asList(shop, restaurant, bank);

        VisitorImpl visitor = new VisitorImpl();
        visitor.addMsg(clientList);
    }
}
