package designpatterns.builder;

public class Human {
    private String firstName;
    private String lastName;
    private Integer age;
    private String job;


    public Human(String firstName, String lastName, Integer age, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getJob() {
        return this.job;
    }

}

