package ru.inheritance;

public class Cat extends Pet {
    private String fairy;

    Cat(String fairy, String name, int age) {
        super(name, age);
        this.fairy = fairy;
    }
}
