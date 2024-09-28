// 6.4 Write a program to display the number of days of a month,
//Nguyen Hoang Tung

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int daysInMonth = 0;
        String monthInput = "";

        // Loop to get valid month and year from the user
        while (true) {
            try {
                // Prompt user to enter a year
                System.out.print("Enter a year (non-negative, all digits): ");
                year = scanner.nextInt();

                if (year < 0) {
                    throw new IllegalArgumentException("Year must be a non-negative number.");
                }

                // Flush the newline after reading the integer
                scanner.nextLine();

                // Prompt user to enter a month
                System.out.print("Enter a month (full name, abbreviation, or number 1-12): ");
                monthInput = scanner.nextLine().trim();

                int month = parseMonth(monthInput);

                if (month == -1) {
                    System.out.println("Invalid month. Please try again.");
                    continue; // ask again if month is invalid
                }

                // Determine the number of days in the month
                daysInMonth = getDaysInMonth(month, year);
                break; // valid inputs, exit loop

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid year and month.");
                scanner.nextLine(); // clear buffer for invalid input
            }
        }

        // Output the result
        System.out.println("Number of days in " + monthInput + " " + year + ": " + daysInMonth);

        scanner.close();
    }

    // Parse the month input from full name, abbreviation, or number
    private static int parseMonth(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1; // invalid month
        }
    }

    // Get the number of days in the month, considering leap years for February
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29; // February in leap year
                } else {
                    return 28; // February in common year
                }
            default:
                return -1; // should never reach here with valid month
        }
    }

    // Determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
