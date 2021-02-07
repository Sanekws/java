package ru.schooljava;

public class Cat extends Animal {

    public Cat(String type, int age, String color) {
        super(type, age, color);
    }

    @Override
    void getSound() {
        System.out.println("Mur mur");
    }

    @Override
    boolean move() {
        return true;
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    boolean climbTrees() {
        return true;
    }

    @Override
    boolean toSwim() {
        return false;
    }
}

