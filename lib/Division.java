package oop_experiment.exp8;

public class Division {
    public void divideNumbers(int a, int b) {
        try {
            int result = a / b; // This may cause ArithmeticException if b is 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
