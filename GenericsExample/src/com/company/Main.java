package com.company;


// Resources: https://www.youtube.com/watch?v=h7piyWnQbZA
// https://www.oracle.com/technical-resources/articles/java/juneau-generics.html
public class Main {

    // These are the notations used for each type
    //E: Element
    //K: Key
    //N: Number
    //T: Type
    //V: Value
    
    public static void main(String[] args) {
        NumericFns<Integer, Integer> fnsOne = new NumericFns<>();
        fnsOne.printVariable(2);
        fnsOne.printSquare(3);

        NumericFns<String, Integer> fnsTwo = new NumericFns<>();
        fnsTwo.printVariable("3String");
        fnsOne.printSquare(4);

        NumericFns<Float, Integer> fnsThree = new NumericFns<>();
        fnsThree.printVariable(4f);
        fnsOne.printSquare(5);

        // You can initialize generic variable with a constructor
        ClassWithConstructor<Integer> classWithConstructor = new ClassWithConstructor(33);
        classWithConstructor.printValue();

        ClassWithConstructor classWithConstructorWithString = new ClassWithConstructor("33");
        // Even this will work; so Double or any other class works here
        ClassWithConstructor<Double> classWithConstructorWithBaseClassDouble = new ClassWithConstructor("33");
        classWithConstructorWithString.printValue();

        NumericFns<BaseClass, Integer> classWithConstructorWithBaseClass = new NumericFns<>();
        // Base class or derived class can be used in the place of a Generic
        classWithConstructorWithBaseClass.printVariable(new BaseClass());
        classWithConstructorWithBaseClass.printVariable(new DerivedClass());
    }
}
