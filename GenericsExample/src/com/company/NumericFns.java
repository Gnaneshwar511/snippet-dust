package com.company;

public class NumericFns<T, K extends Number> {

    T variable;
    K onlyNumberValue;

    void printVariable(T value) {
        this.variable = value;
        System.out.println("variable value is : "+ this.variable);
    }

    void printSquare(K squareNumber) {
        this.onlyNumberValue = squareNumber;
        // We need this intvalue method to do integer operation
        System.out.println(onlyNumberValue.intValue() * onlyNumberValue.intValue());
    }
}
