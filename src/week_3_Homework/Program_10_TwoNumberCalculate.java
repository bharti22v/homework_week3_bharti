package week_3_Homework;
/**
 * Write a program to input any two number and to enter their symbol and find addition, multiplication
 * subtraction and division according to their symbol using if else.
 */

import java.util.Scanner;

public class Program_10_TwoNumberCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input mathematical symbol
        System.out.print("Enter mathematical symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        // Perform operation based on the input symbol
        double result;
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid symbol. Please enter one of '+', '-', '*', or '/'.");
            return;
        }

        // Print the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
