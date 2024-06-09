package designpatterns.adapter;

public class Fish implements FishInterface{
    private String name;
    private Integer age;

    public Fish(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getObjectName() {
        return this.name;
    }

    @Override
    public Integer getObjectAge() {
        return this.age;
    }
}
