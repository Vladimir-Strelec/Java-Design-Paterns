package designpatterns.visitorpatterns;

public class Restaurant extends Client {
    private Boolean ifAbroad;

    public Restaurant(String name, String address, Boolean ifAbroad) {
        super(name, address);
        this.ifAbroad = ifAbroad;
    }


    @Override
    public void acceptMsg(VisitorInterface visitorInterface) {
        visitorInterface.visitRestaurant();
    }
}
