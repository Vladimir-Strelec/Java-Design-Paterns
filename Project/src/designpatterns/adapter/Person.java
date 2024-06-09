package designpatterns.adapter;

public class Person implements PersonInterface{
    private String name;
    private Integer age;
    private String email;

    public Person(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getObjectName() {
        return this.name;
    }

    @Override
    public Integer getObjectAge() {
        return this.age;
    }

    @Override
    public String getObjectEmail() {
        return this.email;
    }
}
