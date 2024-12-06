package oop_experiment.exp9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    // Method to write a character to a file
    public void writeCharacterToFile(char character) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(character); // Write a single character to the file
            writer.write("\n");
            System.out.println("Character written to file: " + character);
        } catch (IOException e) {
            System.out.println("Error writing character to file: " + e.getMessage());
        }
    }

    // Method to write a string to a file
    public void writeStringToFile(String str) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(str); // Write a string to the file
            writer.write("\n");
            System.out.println("String written to file: " + str);
        } catch (IOException e) {
            System.out.println("Error writing string to file: " + e.getMessage());
        }
    }

    // Method to write an array of characters to a file
    public void writeCharArrayToFile(char[] charArray) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(charArray); // Write an array of characters to the file
            writer.write("\n");
            System.out.println("Array of characters written to file: " + new String(charArray));
        } catch (IOException e) {
            System.out.println("Error writing array of characters to file: " + e.getMessage());
        }
    }
}

