package lab1;

import java.util.Scanner;

/**
 *         CSC 201-E81N
 *         Problem 5.45 (page 199-200)
 *         MeanAndStandardDev.java
 *
 *         The scanner reads 10 numbers from the command line (either separated by spaces on the same line
 *         or one per line) and stores them in an array called 'vars'.  I separated the formulas out into their
 *         own methods for readability.  The findMean() method uses the vars array to calculate the mean by looping
 *         through the array and summing all values together then dividing by the length of the array.
 *         The findStandardDeviation() method also uses the vars array to calculate the standard deviation using the
 *         formula in textbook.
 *
 *         Input:   double[] vars to hold numbers read by input scanner
 *         Output:  findMean() and findStandardDeviation() print data directly to console via System.out commands.
 *         Processing:
 *
 *         @author Ben Turney
 *         @version 1.0 10/22/14
 */
public class MeanAndStandardDev {

    public static void main(String[] args) {

        //-----INPUT DATA------
        Scanner in = new Scanner(System.in);
        double[] vars = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < vars.length; i++)
            vars[i] = in.nextDouble();

        //-----OUTPUT DATA------
        System.out.println("The mean is " + findMean(vars));
        System.out.println("The standard deviation is " + findStandardDeviation(vars));
    }

    //--------PROCESSING-------

    /**
     * Finds the mean (average) of the dataset provided.
     *
     * @param dataset The group of numbers to average
     * @return The mean of the data
     */
    private static double findMean(double[] dataset) {
        double sum = 0;
        for (double data : dataset) {
            sum += data;
        }
        return sum / dataset.length;
    }

    /**
     * Finds the standard deviation of the dataset provided
     * @param dataset The group of numbers to find the standard deviation of
     * @return The standard deviation of the numbers
     */
    private static double findStandardDeviation(double[] dataset) {
        double squaredData = 0;
        double sum = 0;

        for (double data : dataset) {
            squaredData += data * data;
            sum += data;
        }
        double squaredAverage = (sum * sum) / dataset.length;

        double variance = (squaredData - squaredAverage) / (dataset.length - 1);

        return Math.sqrt(variance);
    }
}
