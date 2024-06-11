package designpatterns.adapter;

public class AdapterFish implements PersonInterface{
    private Fish fish;

    public AdapterFish(Fish fish) {
        this.fish = fish;
    }


    @Override
    public String getObjectName() {
        return fish.getObjectName();
    }

    @Override
    public Integer getObjectAge() {
        return fish.getObjectAge();
    }

    @Override
    public String getObjectEmail() {
        return "Fish can't have Email";
    }
}
