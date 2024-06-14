package designpatterns.visitorpatterns;

public class Shop extends Client{
    private Integer countWorkers;

    public Shop(String name, String address, Integer countWorkers) {
        super(name, address);
        this.countWorkers = countWorkers;
    }

    @Override
    public void sendMessage() {
        System.out.println("New chocolates are available");
    }

    @Override
    public void printInfo() {
        System.out.println(this.name+" is on address "+this.address+" have: "+this.countWorkers+" persons");
    }


    public Integer getCountWorkers() {
        return countWorkers;
    }

    public void setCountWorkers(Integer countWorkers) {
        this.countWorkers = countWorkers;
    }
}
