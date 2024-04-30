package week_3_Homework;
import java.util.Scanner;

/**
 * Write a program to calculate the sales commission when input the sales details.
 */

public class Program_7_Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate sales commission
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print sales commission
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + commission);

        scanner.close();
   }

}
