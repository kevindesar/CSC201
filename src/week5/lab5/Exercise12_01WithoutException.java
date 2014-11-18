package week5.lab5;

/**
 * CSC 201-E81N Problem 12.1 (page 488) Exercise12_01WithoutException.java
 * <p>
 * This program takes two operands separated by an operator (for example: 3 + 5) from the command-line and does the
 * appropriate calculation.  It is able to handle addition, subtraction, division, and multiplication.  If one or both
 * of the operands are nonnumeric, the program prints an error message and exits.  It does this by converting each
 * argument into a char array and checking if each character in the array is a digit.  If a single character is not a
 * digit, the error message is produced.  If successful, the operator is determined via switch statement, and the
 * operands are parsed and operated on with the appropriate calculation.
 *
 * @author Ben Turney
 */
public class Exercise12_01WithoutException {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operand
        int result = 0;

        verifyInput(args[0]);
        verifyInput(args[2]);

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    /**
     * Verifies the input from the command-line to make sure the operands are numeric.  If input is nonnumeric, method
     * prints an error message and exits the program.
     *
     * @param operand The command-line argument to be verified
     */
    private static void verifyInput(String operand) {
        char[] input = operand.toCharArray();
        for (char anInput : input) {
            if (!Character.isDigit(anInput)) {
                System.out.println("Wrong input: " + operand);
                System.exit(0);
            }
        }
    }
}
