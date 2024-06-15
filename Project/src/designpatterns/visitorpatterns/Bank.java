package designpatterns.visitorpatterns;

public class Bank extends Client{
    private Integer cloneCount;
    public Bank(String name, String address, Integer cloneCount) {
        super(name, address);
        this.cloneCount = cloneCount;
    }


    @Override
    public void acceptMsg(VisitorInterface visitorInterface) {
        visitorInterface.visitBank();

    }
}
