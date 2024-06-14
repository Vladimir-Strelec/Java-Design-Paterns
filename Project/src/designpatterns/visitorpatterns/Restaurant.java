package designpatterns.visitorpatterns;

public class Restaurant extends Client {
    private Boolean ifAbroad;

    public Restaurant(String name, String address, Boolean ifAbroad) {
        super(name, address);
        this.ifAbroad = ifAbroad;
    }

    @Override
    public void sendMessage() {
        System.out.println("In order will be successful collaborate with Bar Zanzibar ");
    }

    @Override
    public void printInfo() {
        System.out.println(this.name+" is on address "+this.address+" "+this.ifAbroad+" have in abroad");
    }

    public Boolean getIfAbroad() {
        return ifAbroad;
    }

    public void setIfAbroad(Boolean ifAbroad) {
        this.ifAbroad = ifAbroad;
    }
}
