package org.example;

public class Calculator {
  
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        int firstOperand1 = firstOperand;
        switch (operator) {
            case ADDITION:
                return firstOperand1 + secondOperand;
            case SUBTRACTION:
                return firstOperand1 - secondOperand;
            case MULTIPLICATION:
                return firstOperand1 * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand1 / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}