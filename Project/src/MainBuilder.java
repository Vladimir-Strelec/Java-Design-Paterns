import designpatterns.builder.Human;
import designpatterns.builder.HumanBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        Human h1 = new Human("Vova", "Strelec", 35, "Driver");

        Human h2 = new HumanBuilder()
            .firstName("Vova")
            .lastName("Strelec")
            .age(35)
            .job("Driver")
            .build();
        System.out.print(h2.getFirstName() + " " + h2.getLastName() + " " + h2.getAge() + " " + h2.getJob());
    }
}