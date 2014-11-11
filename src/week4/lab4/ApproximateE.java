package week4.lab4;

import java.math.BigDecimal;

/**
 * Created by Ben on 11/11/2014.
 */
public class ApproximateE {
    public static void main(String[] args) {
        display();
    }

    /**
     * Generates a readable table for the results.
     */
    public static void display() {
        System.out.println("\ti\t\t\t\te(i)");
        System.out.println("-------------------------------------");
        for (int i = 100; i <= 1000; i = i + 100) {
            System.out.println("\t" + i + "\t\t\t\t" + approximate(i));
        }
    }

    public static BigDecimal approximate(int num) {
        BigDecimal result = new BigDecimal("1.0").setScale(25, BigDecimal.ROUND_HALF_UP);
        for (int i = 1; i <= num; i++) {
            BigDecimal factorial = findFactorial(i);
            BigDecimal term = findTerm(factorial);
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

    private static BigDecimal findTerm(BigDecimal num) {
        BigDecimal one = new BigDecimal("1.0").setScale(25);
        return one.divide(num, 25, BigDecimal.ROUND_HALF_UP);
    }
}
