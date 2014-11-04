package week3.lab3;

/**
 * CSC 201-E81N
 * Problem 9.10 (page 363)
 * QuadraticEquation.java
 * <p>
 * This class takes calculates the quadratic equation (ax^2 + bx + c = 0) using the three coefficients supplied to it
 * via its constructor.  If the discriminant (b^2 - 4ac) is negative, the result returned is 0.
 *
 * @author Ben Turney
 * @version 1.0 11/3/14
 */
public class QuadraticEquation {

    private double a, b, c;

    /**
     * Constructs a new QuadraticEquation with the three coefficients passed in.
     *
     * @param a The first coefficient in the quadratic equation
     * @param b The second coefficient in the quadratic equation
     * @param c The third coefficient in the quadratic equation
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //-----------PROCESSING--------------//

    /**
     * Calculates the discriminant (b^2 - 4ac) of the quadratic equation
     *
     * @return the discriminant
     */
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    /**
     * Calculates the first root of the quadratic equation. Returns 0 if discriminant is negative.
     *
     * @return the first root. 0 if discriminant is negative.
     */
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    /**
     * Calculates the second root of the quadratic equation. Returns 0 if discriminant is 0.
     *
     * @return the second root. 0 if discriminant is negative.
     */
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    /**
     * Gets the first coefficient in the quadratic equation.
     *
     * @return the first coefficient in the quadratic equation.
     */
    public double getA() {
        return a;
    }

    /**
     * Gets the second coefficient in the quadratic equation.
     *
     * @return the second coefficient in the quadratic equation.
     */
    public double getB() {
        return b;
    }

    /**
     * Gets the third coefficient in the quadratic equation.
     *
     * @return the third coefficient in the quadratic equation.
     */
    public double getC() {
        return c;
    }
}
