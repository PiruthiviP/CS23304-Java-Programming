/*Print the sum of two complex numbers by creating a 
class named 'Complex' with separate
functions for sum and print whose real and imaginary parts are
 entered by the user. Initialize
the objects using a constructor  */

import java.util.Scanner;

class Complex {
    double real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex sum(Complex other) {
        double realSum = this.real + other.real;
        double imagSum = this.imag + other.imag;
        return new Complex(realSum, imagSum);
    }

    void print() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class pro34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imag1 = sc.nextDouble();
        System.out.println("Enter the real part of the second complex number:");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imag2 = sc.nextDouble();  
        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        
        Complex sum =c1.sum(c2);

        System.out.println("The sum of the two complex numbers is:");
        sum.print();
    }
}
