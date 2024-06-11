package designpatterns.adapter;

import java.util.List;

public class MainAdapter {
    public static void main(String[] args) {
        FishInterface fish1 = new Fish("Fishy", 4);
        PersonInterface person1 = new Person("Vova", 35, "vasd@da");

        PersonInterface fishAdapter = new AdapterFish((Fish) fish1);

        ClientList clientList = new ClientList((Person) person1, (AdapterFish) fishAdapter);
        List<PersonInterface> list = clientList.strangeList();

        for (PersonInterface o: list) {
            System.out.println(o.getObjectEmail());
        }
    }
}
