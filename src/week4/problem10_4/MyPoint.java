package week4.problem10_4;

/**
 * CSC 201-E81N
 * Problem 10.4 (page 400)
 * MyPoint.java
 *
 * Represents a point with x- and y-coordinates.  The class contains two methods to compute the distance to another
 * point.
 */
public class MyPoint {

    private double x, y;  // Represent the coordinates of the point

    /**
     * Default constructor that creates a point with (0, 0) coordinates.
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Creates a point with the specified coordinates.
     *
     * @param x The x-coordinate
     * @param y The y-coordinate
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the distance from this point to a specified point of the MyPoint type.
     *
     * @param point The point to measure the distance to represented as a MyPoint object.
     * @return the distance between this point and the specified point.
     */
    public double distance(MyPoint point) {
        return Math.sqrt((Math.pow((point.getX() - this.x), 2) + (Math.pow((point.getY() - this.y), 2))));
    }

    /**
     * Returns the distance from this point to a specified point of the MyPoint type.
     *
     * @param x the x-coordinate of the point to measure the distance to.
     * @param y the y-coordinate of the point to measure the distance to.
     * @return the distance between this point and the specified point.
     */
    public double distance(double x, double y) {
        MyPoint point = new MyPoint(x, y);
        return distance(point);
    }

    /**
     * @return the x-coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y-coordinate of the point
     */
    public double getY() {
        return y;
    }
}
