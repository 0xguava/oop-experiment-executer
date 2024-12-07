import java.util.Scanner;

import oop_experiment.exp1.OddEvenChecker;
import oop_experiment.exp2.PrimeChecker;
import oop_experiment.exp3.VariableDemo;
import oop_experiment.exp4.OverloadDemo;
import oop_experiment.exp5.BubbleSort;
import oop_experiment.exp6.Animal;
import oop_experiment.exp6.Dog;
import oop_experiment.exp7.SmartPhone;
import oop_experiment.exp7.Phone;
import oop_experiment.exp7.Camera;
import oop_experiment.exp8.Division;
import oop_experiment.exp9.FileWriterExample;
import oop_experiment.exp10.*;

public class main {

  void press_enter(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Press Enter to continue...");
    scanner.nextLine();
    // scanner.nextLine();
  }

  void clear_scr(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    main lol = new main();
    int choice, num;

    do {
      // Display the menu options
      System.out.println("\n=== Java OOP Experiments ===");
      System.out.println("1. Write a java program to check whether the given number is odd or even.");
      System.out.println("2. write a java program to read a number and check whether the number is prime or not.");
      System.out.println("3. Write a java program to demonstrate the declaration and scope of local, instance and static variables.");
      System.out.println("4. Write a java program to demonstrate concept of method overloading.");
      System.out.println("5. Write a java program to sort a list of integer number in an array.");
      System.out.println("6. Write a java program to demonstrate the concept of method overriding.");
      System.out.println("7. Write a java program to implement multiple inheritances using interface.");
      System.out.println("8. Write a java program to demonstrate the use of exception handling.");
      System.out.println("9. Write a java program to write a character, string and array of characters into a file.");
      System.out.println("10. Exit");
      System.out.print("Enter your choice: ");

      // Read user choice
      choice = scanner.nextInt();
      lol.clear_scr();

      switch (choice) {
        case 1:
          OddEvenChecker oechk = new OddEvenChecker();
          System.out.print("Enter a number to check if it's odd or even: ");
          num = scanner.nextInt();
          System.out.println(oechk.checkOddEven(num));
          lol.press_enter();
          lol.clear_scr();
          break;
        case 2:
          System.out.print("Enter a number to check if it's prime or not: ");
          PrimeChecker checker = new PrimeChecker();
          num = scanner.nextInt();
          if (checker.isPrime(num)) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is not a Prime number.");
          }
          lol.press_enter();
          lol.clear_scr();
          break;
        case 3:
          VariableDemo demo = new VariableDemo();
          System.out.println("Before modification:");
          demo.demonstrateScope();
          // Modify instance and static variables
          demo.modifyVariables();
          // Call the method again to observe the changes
          System.out.println("\nAfter modification:");
          demo.demonstrateScope();
          lol.press_enter();
          lol.clear_scr();
          break;
        case 4:
          OverloadDemo odemo = new OverloadDemo();
          // Demonstrate method overloading
          System.out.println("Adding two integers: " + odemo.add(10, 20));
          System.out.println("Adding three integers: " + odemo.add(10, 20, 30));
          System.out.println("Concatenating two strings: " + odemo.add("Hello, ", "World!"));
          lol.press_enter();
          lol.clear_scr();
          break;
        case 5:
          System.out.print("Enter the number of elements: ");
          int n = scanner.nextInt();
          // Input: Array elements
          int[] array = new int[n];
          System.out.println("Enter the elements:");
          for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
          }
          // Create an instance of BubbleSort from the sorting package
          BubbleSort sorter = new BubbleSort();
          // Sort the array
          sorter.sort(array);
          // Output: Sorted array
          System.out.println("Sorted array:");
          sorter.printArray(array);
          lol.press_enter();
          lol.clear_scr();
          break;
        case 6:
          Animal animal = new Animal();
          System.out.println("Parent class:");
          animal.sound();
          // Create an object of the child class
          Dog dog = new Dog();
          System.out.println("Child class:");
          dog.sound();
          lol.press_enter();
          lol.clear_scr();
          break;
        case 7:
          SmartPhone myPhone = new SmartPhone();
          // Use methods from the Phone interface
          System.out.println("Phone Functionality:");
          myPhone.makeCall("9876543210");
          // Use methods from the Camera interface
          System.out.println("Camera Functionality:");
          myPhone.takePhoto();
          // Use additional method specific to SmartPhone
          System.out.println("Smartphone Exclusive Functionality:");
          myPhone.browseInternet(); 
          lol.press_enter();
          lol.clear_scr();
          break;
        case 8:
          Division division = new Division();
          // Attempt to divide 10 by 0
          System.out.println("Enter numbers to divide: ");
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          division.divideNumbers(a, b);  // This will cause an exception
          lol.press_enter();
          lol.clear_scr();
          break;
        case 9:
          FileWriterExample fileWriter = new FileWriterExample();

          System.out.print("Enter a single character: ");
          char singleChar = scanner.next().charAt(0);// Write a character to the file
          fileWriter.writeCharacterToFile(singleChar);

          System.out.print("Enter a string: ");
          scanner.nextLine(); // Consume the leftover newline
          String inputString = scanner.nextLine(); 
          fileWriter.writeStringToFile(inputString);

          System.out.print("Enter a character array (no spaces): ");
          String charArrayInput = scanner.next();
          char[] charArray = charArrayInput.toCharArray();
          // Write an array of characters to the file
          fileWriter.writeCharArrayToFile(charArray);
          lol.press_enter();
          lol.clear_scr();
          break;
        case 10:
          // Exit
          System.out.println("Exiting the application. Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          lol.press_enter();
          lol.clear_scr();
          break;
      }
    } while (choice != 10);

    scanner.close();
  }
}

