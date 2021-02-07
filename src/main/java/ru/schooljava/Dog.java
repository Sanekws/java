package ru.schooljava;

public class Dog extends Animal {
    public Dog(String type, int age, String color) {
        super(type, age, color);
    }

    @Override
    void getSound() {
        System.out.println("Gaf gaf");
    }

    @Override
    boolean move() {
        return true;
    }

    @Override
    boolean eat() {
        return true;
    }

    @Override
    boolean climbTrees() {
        return false;
    }

    @Override
    boolean toSwim() {
        return true;
    }
}
