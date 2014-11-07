package week3.lab3;

import java.util.Scanner;

/**
 * CSC 201-E81N
 * Problem 9.10 (page 363)
 * QuadraticEntry.java
 * <p>
 * Entry point for calculating the quadratic equation. Scanner reads 3 coefficients from user input. We then construct
 * a new QuadraticEquation and supply it with the three coefficients we just read.  Then, we calculate the discriminant
 * and determine if it is positive, negative, or zero. If it is positive, we calculate and print both roots to the
 * equation.  If it is negative, the equation has no real roots so we print a message saying so. If the discriminant
 * is 0, only one root exists, so we calculate and print it.
 *
 * @author Ben Turney
 * @version 1.0 11/3/14
 */
public class QuadraticEntry {
    public static void main(String[] args) {
        //------INPUT DATA------//
        double a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three coefficients: ");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double discriminant = qe.getDiscriminant();

        //----------OUTPUT DATA----------//
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + qe.getRoot1() + " and " + qe.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + qe.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }


    }
}
