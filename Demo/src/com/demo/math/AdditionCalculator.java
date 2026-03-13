package com.demo.math;

public class AdditionCalculator {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int sum = add(firstNumber, secondNumber);

        System.out.println("Sum: " + sum);
    }
}
