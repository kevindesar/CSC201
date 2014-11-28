package week4.problem10_4;

/**
 * Tests the MyPoint class
 */
public class MyPointTest {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between point1 and point2 is: " + point1.distance(point2));
    }
}
