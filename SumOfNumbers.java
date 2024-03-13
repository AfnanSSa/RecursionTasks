/* Sum of Natural Numbers
 * Objective:
 * Develop a Java program that calculates the sum of the first N natural numbers using recursion.
 * Requirements:
 * The program should use a recursive function to calculate the sum.
 * The input will be an integer N representing the number of terms to sum.
 * The output should be the sum of the first N natural numbers.
 * Assume the input is always a valid non-negative integer.
 * Implement error handling for unexpected situations, such as negative inputs.*/

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
                //printing result
                System.out.println("Sum of the first " + input + " value(s) [from 1 to "+
                        input + "] is: "+ sumOfNumbers(input));
            }
        } catch (InputMismatchException exception){
            System.out.println("\nEnter an integer."); //if input is not an integer
        }

    }

    //method to sum the numbers 
    public static Integer sumOfNumbers(Integer input) {
        if (input > 1){
            return input + sumOfNumbers(input- 1);
        } else {
            return input;
        }
    }
}
