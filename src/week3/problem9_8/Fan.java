package week3.problem9_8;

/**
 * CSC 201-E81N Problem 9.8 (page 362) Fan.java
 * <p>
 * Represents a Fan.  Details include the fan's speed, radius, color, and operating status.
 *
 * @author Ben Turney
 */
public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;      // speed of the fan
    private boolean on;     // running status of fan
    private double radius;  // radius of fan
    private String color;   // color of fan

    /**
     * Creates a new default fan that is set to slow, has radius of 5.0, is not running, and is blue.
     */
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    /**
     * Displays the properties of the Fan as a complete sentence.
     *
     * @return A description of the Fan in a complete sentence.
     */
    public String toString() {
        //Get string representation of speed
        String speed;
        switch (this.speed) {
            case SLOW:
                speed = "slow";
                break;
            case MEDIUM:
                speed = "medium";
                break;
            case FAST:
                speed = "fast";
                break;
            default:
                speed = "default";
        }
        if (on) {
            return "The " + color + " fan of radius " + radius + " is running on speed setting " + speed + ".";
        }
        return "The " + color + " fan of radius " + radius + " is off.";
    }

    /**
     * @return speed of fan (values possible are 1-3 for slow-fast, respectively)
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed The speed of the fan. Use Fan.SLOW (or 1), Fan.MEDIUM (or 2), or Fan.FAST (or 3). Any other values
     *              will default to FAST.
     */
    public void setSpeed(int speed) {
        if (speed <= 3 && speed >= 1) {
            this.speed = speed;
        } else {
            this.speed = FAST;
        }
    }

    /**
     * @return Running status of fan. If running, result will be true.
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on True if running, false if off.
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * @return Radius of fan in inches.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius Radius of fan in inches
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return Color of the fan.
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color Color of the fan. Just a simple String so you could set it to something crazy like "ochre" if you
     *              wanted to.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
