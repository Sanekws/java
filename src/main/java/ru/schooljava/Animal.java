package ru.schooljava;

public abstract class Animal {
    private String type;
    private int age;
    private String color;

    public Animal(String type, int age, String color) {
        this.type = type;
        this.age = age;
        this.color = color;
    }

    abstract void getSound();

    abstract boolean move();

    abstract boolean eat();

    abstract boolean climbTrees();

    abstract boolean toSwim();


    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

}