package week2.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * (Problem 6.13 on Page 237)
 * Write a method to compute the following series:
 * m(i) = (1/2) + (2/3) + ... + (i/i+1)
 * <p>
 * Write a test program that displays the following table:
 * i        m(i)
 * -------------
 * 1        0.5000
 * 2        1.1667
 * ...
 * 19       16.4023
 * 20       17.3546
 *
 * @author Ben Turney
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
