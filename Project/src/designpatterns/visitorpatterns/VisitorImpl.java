package designpatterns.visitorpatterns;

import java.lang.reflect.Array;
import java.util.List;

public class VisitorImpl implements VisitorInterface{


    public void addMsg(List<Client> clients) {
        for (Client client: clients) {
            client.acceptMsg(this);
        }
    }

    @Override
    public void visitBank() {
        System.out.println("Great location for your new brunch");
    }

    @Override
    public void visitRestaurant() {
        System.out.println("In order will be successful collaborate with Bar Zanzibar ");
    }

    @Override
    public void visitMsgShop() {
        System.out.println("New chocolates are available");
    }
}
