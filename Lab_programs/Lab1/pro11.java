//Write Java program to read two matrices and perform add, sub, mul matrices
import java.util.*;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int [3][3];
        int c[][]=new int [3][3];

        System.out.println("Enter the matrix 1:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the matrix 2:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The addition of the matrix:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("The subtraction of the matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                c[i][j] += a[i][k] * b[k][j];

            }
        }
        }
        System.out.println("The multiplication of the matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        





        
        


        

    }
    
}
