package week_3_Homework;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Program_20_ArrayTest {

    public static void main(String[] args) {
        int[] numbers = {21, 141, 53, 127, 71};
        int targetValue = 83;

        //Flagto indicate if the target value is find
        boolean found = false;

        //Check if the array contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;
            }
        }

        //Print the result
        if (found) {
            System.out.println("The array contain the value" + targetValue + ".");
        } else {
            System.out.println("The array does not contain the value" + targetValue + ".");
        }
    }
}
