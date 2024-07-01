package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       AnimalsInterface dog = new Dog();
       AnimalsInterface cat = new Cat();
       AnimalsInterface impl = new InterfaceIMPL(cat);

       impl.sayHello();




    }
}