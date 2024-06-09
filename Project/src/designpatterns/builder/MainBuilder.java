package designpatterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Human h1 = new Human("Vova", "Strelec", 35, "Driver");

        Human h2 = new HumanBuilder()
            .firstName("Vova")
            .lastName("Strelec")
            .age(35)
            .job("Driver")
            .build();
        System.out.println(h2.getFirstName() + " " + h2.getLastName() + " " + h2.getAge() + " " + h2.getJob());

        Human h3 = new HumanBuilder()
                .firstName("Vova")
                .age(12)
                .build();
        System.out.println(h3.getFirstName());
    }
}