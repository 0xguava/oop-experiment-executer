package oop_experiment.exp4;

public class OverloadDemo {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }
}
