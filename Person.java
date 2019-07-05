package com.trckstr;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String lastName, int age, int weight, int height) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person| " +
                "name: " + name +
                ", lastName: " + lastName +
                ", age: " + age +
                ", weight: " + weight +
                ", height: " + height +
                '|';
    }
}
