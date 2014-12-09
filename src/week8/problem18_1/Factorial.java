package week8.problem18_1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * CSC 201-E81N
 * Problem 18.1 (page 728)
 * Factorial.java
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        do {
            System.out.print("Please enter a positive integer: ");
            while(!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next();
            }
            input = in.nextInt();
        } while (input <= 0);
        System.out.println(input + "! = " + factorial(input));
    }

    /**
     * Calculates the factorial of the integer passed in as a parameter.
     * @param n the positive integer for which to calculate the factorial.
     * @return The factorial as a BigInteger to allow for large values.
     */
    private static BigInteger factorial(int n) {
        if (n == 0) {
            return new BigInteger("1");
        }
        return new BigInteger(Integer.toString(n)).multiply(factorial(n - 1));
    }
}
