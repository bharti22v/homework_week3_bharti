package week_3_Homework;

/**
 * Write a program that tells whether the input values is a number or an alphabet or a symbol.
 */

import java.util.Scanner;

public class Program_12_InputValueNumAlphabetSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }

}

