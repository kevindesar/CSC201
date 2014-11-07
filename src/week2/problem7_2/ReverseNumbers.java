package week2.problem7_2;

import java.util.Scanner;

/**
 * CSC 201-E81N
 * Problem 7.2 (page 276)
 * ReverseNumbers.java
 *
 * Reads ten integers and displays them in the reverse of the order in which they were read.
 *
 * @author Ben Turney
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.println("Your numbers reversed: ");
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(numbers[i - 1] + " ");
        }
    }
}
