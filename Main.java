/*
 Sanyerlis Camacaro - Sanyerliscamacaro@uat.edu - CSC263
 Assignment 2.1: Recursion

 Guidelines:
 Outline and implement a recursive solution for finding the smallest value in an array.

 This is a simple program that interacts with the user to find the smallest value in a predefined array
 of integers using a recursive approach.
 */
// Importing the Scanner class from the java.util package.
import java.util.Scanner;

// Main class that contains the main method.
public class Main {

    public static void main(String[] args) {// Main method where the program execution begins.
        // Introduction
        System.out.println("\nWelcome to the Smallest Value Finder Demo!");
        System.out.println("\nThis is an Recursion Demo by Sanyerlis Camacaro that finds a given smallest value in an array.");

        // Prompt the user to enter their name.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter your name: ");
        String userName = scanner.nextLine();

        // Greet the user.
        System.out.println("\nHello, " + userName + "! Let's find the smallest value in an array.");

        // Array of integers.
        int[] array = {5, 3, 9, 2, 8, 1, 6};

        // Display the numbers in the array.
        System.out.print("\nNumbers in the array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line.

        // Call the recursive method to find the smallest value.
        int smallestValue = findSmallestValue(array, 0, array.length - 1);

        System.out.println("\nThe smallest value in the array is: " + smallestValue);

        // Goodbye message.
        System.out.println("\nThank you, " + userName + ", for using the Smallest Value Finder demo! We hope you enjoyed it. Goodbye!");
    }

    // Recursive method to find the smallest value in the array.
    private static int findSmallestValue(int[] array, int start, int end) {
        // Base case: If the array has only one element
        if (start == end) {
            return array[start];
        }

        // Recursive case: Divide the array into two halves.
        int mid = (start + end) / 2;

        // Recursively find the smallest value in each half.
        int leftSmallest = findSmallestValue(array, start, mid);
        int rightSmallest = findSmallestValue(array, mid + 1, end);

        // Compare the smallest values from the two halves
        return Math.min(leftSmallest, rightSmallest);
    }
}
