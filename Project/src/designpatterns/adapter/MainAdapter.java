package designpatterns.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        FishInterface f1 = new Fish("Fishy", 4);
        System.out.println(f1.getObjectName());

        PersonInterface p1 = new Person("Vova", 35, "vasd@da");
        System.out.println(p1.getObjectEmail());
    }
}
