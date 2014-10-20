package lab1;

import java.util.Scanner;

/**
 * @author Ben Turney
 *         CSC 201-E81N
 *         <p/>
 *         Problem 5.45 (page 199-200)
 *         In business applications, you are often asked to compute the mean and standard deviation of data.
 *         The mean is simply the average of the numbers. The standard deviation is a statistic that tells you
 *         how tightly all the various data are clustered around the mean in a set of data.
 *         Write a program that prompts the user to enter 10 numbers, and displays the mean and standard deviation of these
 *         numbers.
 */
public class Lab {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] vars = new double[10];
        double mean, variance, stddev;

        System.out.print("Enter ten numbers: ");

        //Read input
        for (int i = 0; i < vars.length; i++)
            vars[i] = in.nextDouble();

        // Calculate the mean
        mean = findAverage(vars);

        //Subtract the mean from each number and square the result (the squared difference)
        for (int i = 0; i < vars.length; i++) {
            vars[i] = Math.pow((vars[i] - mean), 2);
            System.out.println(vars[i]);
        }

        //Calculate average of new results
        variance = findAverage(vars);

        // Standard deviation is square root of the variance
        stddev = Math.sqrt(variance);

        //Output results
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + stddev);

    }

    private static double findAverage(double[] dataset) {
        double sum = 0;
        for (double data : dataset) {
            sum += data;
        }
        return sum / dataset.length;
    }
}
