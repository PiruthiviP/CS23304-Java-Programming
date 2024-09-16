/*
 

Mill cloth
Handloom it
Write a program using switch and if statements to compute the net amount to be paid by a customer.

 */
import java.util.Scanner;

public class pro26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = scanner.nextDouble();

        double discount = 0.0;

        if (amount >= 0 && amount <= 100) {
            discount = 0.05;
        } else if (amount > 100 && amount <= 200) {
            discount = amount <= 200 ? 0.05 : 0.075;
        } else if (amount > 200 && amount <= 300) {
            discount = 0.075;
        } else if (amount > 300) {
            discount = 0.10 + (amount > 300 ? 0.05 : 0.0);
        }

        double netAmount = amount - (amount * discount);

        System.out.println("Net amount to be paid: " + netAmount);
    }
}