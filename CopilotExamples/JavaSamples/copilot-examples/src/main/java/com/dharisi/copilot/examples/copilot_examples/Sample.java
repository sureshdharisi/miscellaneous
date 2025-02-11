package com.dharisi.copilot.examples.copilot_examples;

/**
 * This class provides a method to calculate the factorial of a given number.
 */
public class Sample {
    /**
     * Calculates the factorial of a given number.
     *
     * @param n the number for which factorial needs to be calculated
     * @return the factorial of the given number
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Main method to test the factorial method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int number = 5; // Replace with the desired number
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}