package org.example;


import org.example.model.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car().build();
            car.setBrand("BMW");
            car.setModel("323");

        System.out.println(car.info());
        car.setBrand("Opel");

        System.out.println(car.info());
        Car car2 = new Car();

        System.out.println(car.equals(car2));
    }
}