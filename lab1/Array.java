
//6.5 Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.
//Nguyen Hoang Tung 20225948
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array to store the elements
        double[] array = new double[size];

        // Prompt the user to enter elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Calculate the sum of the array
        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        // Calculate the average of the array
        double average = sum / size;

        // Sort the array
        Arrays.sort(array);

        // Output the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Close the scanner object
        scanner.close();
    }
}
