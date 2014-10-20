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
        float[] vars = new float[10];
        float sum = 0;
        float mean;

        System.out.print("Enter ten numbers: ");

        //Read input
        for (int i = 0; i < vars.length; i++)
            vars[i] = in.nextFloat();

        for (float var : vars)
            sum += var;

        mean = sum / vars.length;
        System.out.println("The mean is " + mean);

    }
}
