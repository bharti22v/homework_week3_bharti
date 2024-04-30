package week_3_Homework;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program_2_ItIsALeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a year
        System.out.print("Enter a year:");
        int year = scanner.nextInt();

        //Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Print the result
        if(isLeapYear) {
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + "is not a leap year.");
        }
        //Close the scanner
        scanner.close();
    }

    }

