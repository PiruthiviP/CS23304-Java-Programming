//Write a Java program that reads an integer and
// display whether it is odd or even, largest of two numbers, 
//squares & cubes of each number. Use user defined functions
import java.util.Scanner;

 class function {
    private void oddoreven(int num)
    {
        if(num%2==0)
        System.out.println("its even");
        else
        System.out.println("Its odd");
    } 
    void largest(int num1,int num2)
    {
        if(num1>num2)
        System.out.println( num1+"is largest");
        else
        System.out.println( num2+"is largest");
    
    }
    void squares(int num)
    {
        System.out.println("The square of the number is"+num*num);
    }
    void cube(int num)
    {
        System.out.println("The cube of the number is"+num*num*num);

    }


    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number1,number2;
      System.out.print("Enter the number1:");
      number1=sc.nextInt();
      System.out.print("Enter the number2:");
      number2=sc.nextInt();
      
      
      function obj=new function();
      obj.oddoreven(number1);
      obj.largest(number1,number2);
      obj.squares(number1);
      obj.cube(number1);
      
    }
    
}
