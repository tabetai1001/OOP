
//2.2.5:Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
//Nguyen Hoang Tung 20225948
import java.util.Scanner;

public class TwoDoubleNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two double numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum, difference, product, and quotient
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Check if the second number is zero before division to avoid division by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close the scanner object
        scanner.close();
    }
}
