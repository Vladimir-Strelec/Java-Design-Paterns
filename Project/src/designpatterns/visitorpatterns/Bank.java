package designpatterns.visitorpatterns;

public class Bank extends Client{
    private Integer cloneCount;
    public Bank(String name, String address, Integer cloneCount) {
        super(name, address);
        this.cloneCount = cloneCount;
    }

    @Override
    public void sendMessage() {
        System.out.println("Great location for your new brunch");
    }

    @Override
    public void printInfo() {
        System.out.println(this.name+" is on address "+this.address+" have: "+this.cloneCount);
    }

    public Integer getCloneCount() {
        return cloneCount;
    }

    public void setCloneCount(Integer cloneCount) {
        this.cloneCount = cloneCount;
    }
}
