package problem5_12;

/**
 * Ben Turney
 * CSC 201-E81N
 * Use a while loop to find the smallest integer n such that n^2 is greater than 12000.
 */
public class Solution {
    public static void main(String[] args) {
        int n = 0;
        while (n * n <= 12000) {
            n++;
        }
        System.out.println("Smallest n such that n^2 > 12000: " + n);
    }
}
