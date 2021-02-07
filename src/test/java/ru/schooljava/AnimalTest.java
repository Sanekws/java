package ru.schooljava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    Cat cat = new Cat("Cat", 4, "red");
    Dog dog = new Dog("Dog", 2, "black");


    @Test
    void getType() {
        assertEquals("Cat", cat.getType());
        assertEquals("Dog", dog.getType());
    }

    @Test
    void getAge() {
        assertEquals(4, cat.getAge());
        assertEquals(2, dog.getAge());
    }

    @Test
    void getColor() {
        assertEquals("red", cat.getColor());
        assertEquals("black", dog.getColor());
    }
}