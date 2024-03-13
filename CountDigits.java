/* Count Digits
 * Objective: Develop a Java program that counts the number of digits in a given non-negative integer using recursion.
 * Requirements:
 * The program should use a recursive function to count the digits.
 * The input will be a non-negative integer.
 * The output should be the number of digits in the input integer.
 * Assume the input is always a valid non-negative integer.
 * Implement error handling for unexpected situations, such as negative inputs.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Error Handling*/
        try {
            System.out.println("\nEnter a number: "); //prompting user to enter a number
            Integer input = scanner.nextInt(); //getting input
            if (input <= 0) {
                System.out.println("\nEnter a positive number."); //if input is a negative value
            } else {
                //printing result
                System.out.println("\nNumber of digits in " + input + " is " + countDigit(input));
            }
        } catch (InputMismatchException exception) {
            System.out.println("\nEnter an integer."); //if input is not an integer
        }

    }

    //method to reverse the input
    public static Integer countDigit(Integer input) {
        Integer count = 0;
        if (input != 0) {
            input = input / 10; //extracting digit
            count++;
            return count + countDigit(input);
        }
        return count;

        /* Example:
         * input: 34.
         * output: Number of digits in 34 is 2
         * Explanation:
         * 34/10 = 3
         * counter will be incremented by 1, so it will be equal to 1
         * return 1 + countDigit(3)
         * 3/10 = 0
         * counter will be incremented by 1, so it will be equal to 2
         * return 2 + countDigit(0)
         * the statement will stop and countDigit() will return count value*/
    }
}
