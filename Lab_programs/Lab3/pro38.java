//Write a program to create a class that contains two methods add() and sub() that performs
//addition and subtraction of two numbers respectively and print the output.

public class pro38 {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void sub(int a, int b) {
        int difference = a - b;
        System.out.println("The difference of " + a + " and " + b + " is " + difference);
    }

    public static void main(String[] args) {
        pro38 calculator = new pro38();
        calculator.add(10, 5);
        calculator.sub(10, 5);
    }
}