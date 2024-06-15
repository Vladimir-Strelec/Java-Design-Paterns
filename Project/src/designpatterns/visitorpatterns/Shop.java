package designpatterns.visitorpatterns;

public class Shop extends Client{
    private Integer countWorkers;

    public Shop(String name, String address, Integer countWorkers) {
        super(name, address);
        this.countWorkers = countWorkers;
    }

    @Override
    public void acceptMsg(VisitorInterface visitorInterface) {
        visitorInterface.visitMsgShop();
    }
}
