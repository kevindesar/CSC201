package week2.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * CSC 201-E81N
 * Problem 6.13 (page 237)
 * SumSeries.java
 * <p>
 * The scanner reads a positive integer from the command line. If the value entered is not a positive integer,
 * an error message is displayed and the scanner waits for another input.  Once a correct input is received,
 * the integer is passed to the sumSeries() method which calculates the formula shown in the javadoc for that method.
 * It prints the results in a table, and each number in the m(i) column is formatted to have 3 decimal places.
 * <p>
 * Input:   int number - holds the positive integer read by input scanner
 * Output:  sumSeries() prints table to console via System.out
 * Processing: sumSeries() calculates the values based on the formula
 *
 * @author Ben Turney
 * @version 1.0 10/29/14
 */
public class SumSeries {
    /**
     * Computes the following series: m(i) = (1/2) + (2/3) + ... + (i/i+1)
     *
     * @param number the positive integer at which the series ends
     */
    public static void sumSeries(int number) {
        //------PROCESSING-------//
        DecimalFormat df = new DecimalFormat("#.0000");
        double sumSeries = 0;
        System.out.println("i\t\t\tm(i)");
        System.out.println("--------------------------");
        for (int i = 1; i <= number; i++) {
            sumSeries += i / (i + 1.0);
            //------OUTPUT DATA---------//
            System.out.println(i + "\t\t\t" + df.format(sumSeries));
        }
    }

    public static void main(String[] args) {

        //------INPUT DATA---------//
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive integer: ");
            while (!in.hasNextInt()) {
                System.out.println("Error: Not a number");
                in.next();
            }
            number = in.nextInt();
        } while (number <= 0);

        sumSeries(number);
    }
}
