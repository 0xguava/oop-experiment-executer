package oop_experiment.exp6;

// Child class that overrides the method from Animal class
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}
