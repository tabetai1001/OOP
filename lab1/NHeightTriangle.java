//6.3 Write a program to display a triangle with a height of n stars (*), n is entered by users.
//Nguyen Hoang Tung 20225948

import java.util.Scanner;

public class NHeightTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the height of the triangle
        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Print spaces to center the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars in odd numbers (1, 3, 5, 7, ...)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner object
        scanner.close();
    }
}
