package week_3_Homework;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Program_19_AverageValueOfArray {
    public static void main(String[] args) {
        int[]numbers = {21,141,53,127,71};

        //Calculate sum of array elements
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }

        //Calculate average
        double average = (double)sum/numbers.length;

        //Print the average
        System.out.println("Average value of array elements:" + average);
    }

}
