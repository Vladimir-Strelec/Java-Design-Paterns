package designpatterns.visitorpatterns;

public abstract class Client {
    protected String name;
    protected String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void acceptMsg(VisitorInterface visitorInterface);

}
