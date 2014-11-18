package week5.lab5;

/**
 * CSC 201-E81N Problem 12.1 (page 488) Exercise12_01WithException.java
 * <p>
 * This program takes two operands separated by an operator (for example: 3 + 5) from the command-line and does the
 * appropriate calculation.  It is able to handle addition, subtraction, division, and multiplication.  If one or both
 * of the operands are nonnumeric, the program prints an error message and exits.  It does this by trying to parse an
 * Integer from the argument, and if unsuccessful catches a NumberFormatException, prints an error message, and exits.
 * If successful, the operands are parsed and stored as ints and the operator is determined via switch statement. The
 * integers are then operated on with the appropriate calculation.
 *
 * @author Ben Turney
 */
public class Exercise12_01WithException {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operand
        int result = 0;

        // The operands
        int operand1 = 0;
        int operand2 = 0;

        try {
            operand1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }

        try {
            operand2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + args[2]);
            System.exit(0);
        }

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
