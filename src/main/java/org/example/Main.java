package org.example;

//Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'.
// Initialize both variables with the value 0.
//Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.
//Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.
//Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.
//Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.

public class Main {
    public static void main(String[] args) {
        NewClass class1 = new NewClass();
        NewClass class2 = new NewClass();

        NewClass.incrementTotalCount();
        class1.incrementInstanceCount();
        class2.incrementInstanceCount();
        NewClass.incrementTotalCount();

        System.out.println(class1);

        System.out.println(Calculator.add(6,2));
        System.out.println(Calculator.subtract(6,2));
        System.out.println(Calculator.multiply(6,2));
        System.out.println(Calculator.divide(6,2));
    }
}