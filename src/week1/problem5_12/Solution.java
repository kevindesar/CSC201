package week1.problem5_12;

/**
 * CSC 201-E81N
 * Problem 5.12 (page 193)
 * Solution.java
 *
 * Use a while loop to find the smallest integer n such that n^2 is greater than 12000.
 *
 * @author Ben Turney
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
