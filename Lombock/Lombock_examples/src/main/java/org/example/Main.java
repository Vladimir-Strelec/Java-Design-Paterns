package org.example;


import org.example.model.Car;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car()
                .brand("Mercedes")
                .model("200")
                .build();


        System.out.println(car1.info());
        car1.setBrand("Opel");

        System.out.println(car1.info());
        Car car2 = new Car();

        Car car3 = Car.builder()
                .brand("Oppel")
                .model("Vectra")
                .build();

        System.out.println(car1.equals(car2));
        System.out.println(car3.info());
        System.out.println("This branch is MAIN and we will be test this branch");


    }
}