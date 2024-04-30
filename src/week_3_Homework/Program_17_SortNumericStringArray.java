package week_3_Homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program_17_SortNumericStringArray {
    public static void main(String[] args) {
        int[] numericArray = {11, 2, 9, 1, 7};

        // Sorting numeric array
        Arrays.sort(numericArray);

        // Printing sorted array
        System.out.println("Sorted numeric array:");
        for (int num : numericArray) {
            System.out.println(num + " ");
        }

        String[] stringArray = {"Mango", "Goa", "Iceland", "Holiday", "Lottery"};

        // Sorting string array
        Arrays.sort(stringArray);

        // Printing sorted array
        System.out.println("Sorted string array:");
        for (String str : stringArray) {
            System.out.println(str + " ");

        }
    }
}