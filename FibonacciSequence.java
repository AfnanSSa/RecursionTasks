/* Fibonacci Sequence
 * Objective:
 * Develop a Java program capable of calculating the nth Fibonacci number. The Fibonacci
 * sequence is a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1.
 * Requirements:
 * The program should use recursion to calculate the nth Fibonacci number.
 * The first two numbers in the Fibonacci sequence are 0 and 1, respectively.
 * The input will be an integer n, representing the position in the Fibonacci sequence.
 * The output should be the nth Fibonacci number.
 * Assume that the input is always a valid non-negative integer.
 * Implement error handling for unexpected situations, such as negative inputs or inputs that are not integers.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Error Handling*/
        try{
            System.out.println("\nEnter a number: "); //prompting user to enter a number
            Integer input = scanner.nextInt(); //getting input
            if (input <= 0){
                System.out.println("\nEnter a positive number."); //if input is a negative value
            } else {
                System.out.println("Fibonacci Sequence of " + input + " value(s):");
                //printing sequence
                for (Integer i = 0; i < input; i++){
                    System.out.print(fibonacciSequence(i) + " ");
                }
            }
        } catch (InputMismatchException exception){
            System.out.println("\nEnter an integer."); //if input is not an integer
        }
    }

    //method to get nth value of Fibonacci Sequence
    public static Integer fibonacciSequence(Integer n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciSequence(n -1) + fibonacciSequence(n-2);
        }
    }
}
