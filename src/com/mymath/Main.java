// Java program to use negateExact() for returning numbers with another sign and throw an exception if overflow occurs

package com.mymath;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Negation number 15
        int int_number = Math.negateExact(15);

        // Printing int_number to console
        System.out.println(int_number); // Output: -15

        // Negation number -15
        int_number = Math.negateExact(-15);

        // Printing int_number to console
        System.out.println(int_number); // Output: 15

        // Negation number 12345L
        long long_number = Math.negateExact(12345L);

        // Printing long_number to console
        System.out.println(long_number); // Output: -12345L

        // Negation number -12345L
        long_number = Math.negateExact(-12345L);

        // Printing long_number to console
        System.out.println(long_number); // Output: 12345L
    }
}
