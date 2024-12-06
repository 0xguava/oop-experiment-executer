package oop_experiment.exp3;

public class VariableDemo {
    // Instance variable (belongs to an object of the class)
    private int instanceVar = 10;

    // Static variable (shared by all instances of the class)
    static int staticVar = 20;

    // Method to demonstrate the scope of local variables
    public void demonstrateScope() {
        // Local variable (declared inside a method)
        int localVar = 30;

        // Accessing variables
        System.out.println("Instance Variable: " + instanceVar); // Access instance variable
        System.out.println("Static Variable: " + staticVar);    // Access static variable
        System.out.println("Local Variable: " + localVar);      // Access local variable
    }

    // Method to modify instance and static variables
    public void modifyVariables() {
        instanceVar += 5; // Modify instance variable
        staticVar += 10;  // Modify static variable
    }
}
