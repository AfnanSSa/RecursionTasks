/* Calculate Factorial
 * Objective:
 * Develop a Java program that calculates the factorial of a given non-negative integer.
 * The factorial of a number n is the product of all positive integers less than or equal
 * to n. It is denoted by n!.
 * Requirements:
 * The program should use a recursive function to compute the factorial.
 * Handle the base case properly: the factorial of 0 is 1.
 * The input will be an integer representing the number for which the factorial is to be computed.
 * The output should be the factorial of the input number.
 * Assume that the input is always a valid non-negative integer.
 * Implement error handling for unexpected situations, such as negative inputs.*/

import java.util.Scanner;

public class RecursionTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a number: ");//prompting user to enter a number
        Integer input = scanner.nextInt(); //getting input
        System.out.println("Factorial of " + input + " is: " + factorialRecursion(input)); //printing result
    }

    //method to get factorial
    public static Integer factorialRecursion(Integer number) {
        if (number >= 1) {
            return number * factorialRecursion(number - 1); // n * n-1 * n-2 * ..
        } else {
            return 1;
        }
    }
}
