package week_3_Homework;
//Write a program to input any number and find out if it's odd or even.
import java.util.Scanner;

public class Program_6_AnyNumInputOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Input number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is odd or even
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }

            scanner.close();

}
    }
