package week_3_Homework;
/**
 * Write a program to generate the Salary Slip
 * Input employee details
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */
import java.util.Scanner;

public class Program_5_SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances and deductions
        double hra = basicSalary * 0.10;
        double ta = basicSalary * 0.09;
        double da = basicSalary * 0.08;
        double pf = basicSalary * 0.20;

        // Calculate gross salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Print salary slip
        System.out.println("_");
        System.out.println("|          Salary Slip          |");
        System.out.println("||");
        System.out.println("| Employee Id   : " + employeeId + "         |");
        System.out.println("| Employee Name : " + employeeName + "       |");
        System.out.println("||");
        System.out.println("| Basic Salary  : " + basicSalary + "       |");
        System.out.println("| HRA  10%      : " + hra + "       |");
        System.out.println("| TA   9%       : " + ta + "       |");
        System.out.println("| DA   8%       : " + da + "       |");
        System.out.println("| PF  - 20%     : " + pf + "       |");
        System.out.println("||");
        System.out.println("| Gross Salary  : " + grossSalary + "       |");
        System.out.println("|===========================|");

        scanner.close();

}

}
