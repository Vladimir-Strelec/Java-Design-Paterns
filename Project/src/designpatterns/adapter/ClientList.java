package designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class ClientList {
    private Person person;
    private AdapterFish fish;

    public ClientList(Person person, AdapterFish fish) {
        this.person = person;
        this.fish = fish;
    }

    public List<PersonInterface> strangeList() {
        List<PersonInterface> result = new ArrayList<>();
        result.add(this.person);
        result.add(this.fish);
        return result;
    }
}
