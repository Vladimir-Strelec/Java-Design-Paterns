package org.example;

import java.util.Objects;

public class InterfaceIMPL implements AnimalsInterface{

    private AnimalsInterface animal;


    public InterfaceIMPL(AnimalsInterface animal) {
        this.animal = animal;
    }


    @Override
    public void sayHello() {
        animal.sayHello();
    }

}
