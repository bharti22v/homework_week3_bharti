package week_3_Homework;

/**
 * Write a Java program to sum values of an array.
 */

public class Program_18_SumValueOfArray {
    public static void main(String[] args) {
        int[]numbers = {21,141,53,127,71};

        //Calculate sum of array elements
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }

        //Print the sum
        System.out.println("Sum of array elements;" + sum);
    }
}
