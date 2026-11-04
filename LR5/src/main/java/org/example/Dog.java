package org.example;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Гав!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", "Овчарка", 3);
        dog.bark();
    }
}