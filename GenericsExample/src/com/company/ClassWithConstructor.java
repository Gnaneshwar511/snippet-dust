package com.company;

// Here we have a constructor which initializes generic variable
public class ClassWithConstructor<T> {

    T variable;

    ClassWithConstructor(T value) {
        this.variable = value;
    }

    void printValue() {
        System.out.println(variable.getClass());
    }
}
