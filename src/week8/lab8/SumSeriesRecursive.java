package week8.lab8;

/**
 * CSC 201-E81N
 * Problem 18.4 (page 729)
 * SumSeriesRecursive.java
 * <p>
 * This program calcuates the sum series as defined by m(i) = 1 + 1/2 + 1/3 + ... + 1/i.
 * It displays m(i) for i = 1, 2, ..., 10 in a table format printed to the console.
 * <p>
 * The sumSeries method takes an integer parameter representing i in the equation.  It recursively calculates the series
 * by checking if the parameter is the end condition (i = 1). If it is, a value of 1 is returned.  If it is not, the
 * method is called recursively until the end condition is met, summing the result along the way.
 */
public class SumSeriesRecursive {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("-----------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t" + sumSeries(i));
        }
    }

    /**
     * Computes the sum series: m(n) = 1 + 1/2 + 1/3 + ... + 1/n
     *
     * @param n The number of terms to calculate the series to.
     * @return The sum series.
     */
    private static double sumSeries(int n) {
        if (n == 1) {
            return 1.0;
        }
        return (1.0 / n) + sumSeries(n - 1);
    }
}
