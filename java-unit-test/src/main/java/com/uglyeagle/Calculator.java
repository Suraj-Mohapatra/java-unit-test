package com.uglyeagle;

public class Calculator {
        
    public static void main(String[] args) {
        System.out.println("This project is not meant to run like this");
        System.out.println("go with any of these commands below");
        System.out.println("mvn clean test");
        System.out.println("mvn clean verify");
        System.out.println("mvn jacoco:report");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }
}
