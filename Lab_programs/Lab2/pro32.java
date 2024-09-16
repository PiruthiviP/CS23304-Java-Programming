//Write a program to print Fibonacci numbers. 1,1,2,3,5,8,13, 21,… m. Use do---while to print m numbers.

public class pro32 {
    public static void main(String[] args) {
        int m = 10; 
        int a = 1;
        int b = 1;
        int count = 2;

        System.out.print("1, 1"); 

        do {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(", " + b);
            count++;
        } while (count <= m);

        System.out.println();
    }
}
