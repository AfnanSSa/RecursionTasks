/* Reverse a String
 * Objective:
 * Develop a Java program that reverses a given string using recursion.
 * Requirements:
 * The program must use recursion to reverse the input string.
 * The input will be a string that may include any character (letters, digits, symbols).
 * The output should be the reverse of the input string.
 * Consider an empty string as a valid input, for which the output will also be an empty string.
 * Implement error handling for unexpected situations, if any.*/

import java.util.Scanner;

public class RecursionTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string to reverse:");
        String input = scanner.nextLine();
        System.out.println("Reverse: " + stringReverse(input));

    }

    //method to reverse the input
    public static String stringReverse(String input) {
        if (input == null || input.length() <= 1){ //if input is empty or contains 1 letter
            return input;
        } else {
            //reversing the input 
            return stringReverse(input.substring(1)) + input.charAt(0);
        }
    }
}
