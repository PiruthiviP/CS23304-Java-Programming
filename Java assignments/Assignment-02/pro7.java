//7) Using function with return type find the addition, subtraction, multiplication, division of two numbers .Using switch case get the choice from user.

import java.util.Scanner;

public class pro7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Choose operation: 1. Add 2. Subtract 3. Multiply 4. Divide");
        int choice = sc.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        System.out.println("The result is: " + result);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

  static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}
