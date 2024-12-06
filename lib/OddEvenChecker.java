package oop_experiment.exp1;

public class OddEvenChecker {
    // Method to check if a number is odd or even
    public String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even.";
        } else {
            return number + " is Odd.";
        }
    }
}
