//6) Using switch case write a Java program to get the choice from the user to get the user choice 1) Coffee 2) Tea 3) Juice. Ask the user if they wish to continue and get input again from the user printing the choices again. If a wrong choice is given, print wrong choice and ask if the user wishes to continue again.

import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueChoice = true;

        while (continueChoice) {
            System.out.println("Choose your beverage:");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Juice");
            System.out.print("Enter your choice (1-3): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Coffee.");
                    break;
                case 2:
                    System.out.println("You chose Tea.");
                    break;
                case 3:
                    System.out.println("You chose Juice.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            String continueInput = sc.next();

            if (!continueInput.equalsIgnoreCase("y")) {
                continueChoice = false;
            }
        }

        sc.close();
    }
}
