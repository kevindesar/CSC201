package week4.lab4;

import java.math.BigDecimal;

/**
 * CSC 201-E81N
 * Problem 10.20 (page 406)
 * ApproximateE.java
 * <p>
 * This class approximates the constant 'e' with 25 digits of precision using the formula:
 * e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
 * <p>
 * The program first generates the headers for the table to be displayed and then begins looping through a for-loop
 * which is governed by the three constants STARTING_POINT, ENDING_POINT, and INTERVAL.  Each loop prints another line
 * of the table which contains the current value being used to calculate e and the resulting value of e.
 *
 * It does this by calling the approximate() method. approximate() takes whatever value is passed into it and calculates
 * every factorial (and inverse of the factorial) between 1 and n and adds the inverses to 1 to complete the series.
 *
 * findFactorial() and invertFactorial() are helper methods to maintain readability.
 */
public class ApproximateE {
    //--------INPUT DATA--------//
    private static final int STARTING_POINT = 100;
    private static final int ENDING_POINT = 1000;
    private static final int INTERVAL = 100;

    public static void main(String[] args) {
        display();
    }

    /**
     * Generates a readable table for the results obtained by the approximate() method.
     */
    public static void display() {
        System.out.println("\ti\t\t\t\te(i)");
        System.out.println("-------------------------------------");
        for (int i = STARTING_POINT; i <= ENDING_POINT; i = i + INTERVAL) {
            //--------OUTPUT DATA--------//
            System.out.println("\t" + i + "\t\t\t\t" + approximate(i));
        }
    }

    //------------------PROCESSING--------------------//

    /**
     * Approximates e with 25 digits of precision using the series: e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n! where "n" is the integer passed in.
     *
     * @param n The integer to calculate the series to. A higher value gives slightly more precision
     * @return An approximate value for e with 25 digits of precision.
     */
    public static BigDecimal approximate(int n) {
        BigDecimal result = new BigDecimal("1.0").setScale(25, BigDecimal.ROUND_HALF_UP);
        for (int i = 1; i <= n; i++) {
            BigDecimal factorial = findFactorial(i);
            BigDecimal term = invertFactorial(factorial);
            BigDecimal augend = new BigDecimal(String.valueOf(term));
            result = result.add(augend);
        }
        return result;
    }

    /**
     * Calculates the factorial of the integer provided.
     *
     * @param num the integer to calculate the factorial for
     * @return the factorial of the integer
     */
    private static BigDecimal findFactorial(int num) {
        BigDecimal factorial = new BigDecimal("1.0");
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(new BigDecimal(String.valueOf(i)));
        }
        return factorial;
    }

    /**
     * Simply inverts the factorial value passed in (i.e. 1/n!).
     *
     * @param n The factorial value to invert
     * @return The inverse of the factorial (i.e. i/n!) with 25 digits of precision.
     */
    private static BigDecimal invertFactorial(BigDecimal n) {
        BigDecimal one = new BigDecimal("1.0").setScale(25);
        return one.divide(n, 25, BigDecimal.ROUND_HALF_UP);
    }
}
