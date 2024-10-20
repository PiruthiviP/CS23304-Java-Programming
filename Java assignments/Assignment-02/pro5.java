//5) Write a Java program to get a number from the user and print whether it is an odd or even number.

import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        sc.close();
    }
}