package week_3_Homework;
/**
 * Write a program to print the City name when input any alphabet from A to F.
 * If any other letter entered than entry is invalid.
 */

import java.util.Scanner;

public class Program_8_CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet from 'A' to 'F': ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        // Print city name based on the input alphabet
        if (alphabet == 'A') {
            System.out.println("City Name: Amman");
        } else if (alphabet == 'B') {
            System.out.println("City Name: Beijing");
        } else if (alphabet == 'C') {
            System.out.println("City Name: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City Name: Dallas");
        } else if (alphabet == 'E') {
            System.out.println("City Name: Ecatepec");
        } else if (alphabet == 'F') {
            System.out.println("City Name: Florence");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
        }

        scanner.close();
    }

}
