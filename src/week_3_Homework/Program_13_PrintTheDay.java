package week_3_Homework;

/**
 * Write a Java program which input any number between( 1 to 7) and its print The Days name
 */

import java.util.Scanner;

public class Program_13_PrintTheDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Print day of the week based on the input number using switch statement
        switch (dayNumber) {
            case 1:
        System.out.println("Day of the week: MONDAY");
            break;
            case 2:
         System.out.println("Day of the week: TUESDAY");
            break;
            case 3:
         System.out.println("Day of the week: WEDNESDAY");
           break;
            case 4:
         System.out.println("Day of the week: THURSDAY");
          break;
            case 5:
         System.out.println("Day of the week: FRIDAY");
           break;
            case 6:
           System.out.println("Day of the week: SATURDAY");
           break;
            case 7:
          System.out.println("Day of the week: SUNDAY");
            break;
            default:
         System.out.println("Week contains 1 to 7 days");
        }

        scanner.close();
    }
}