/*To determine the sum of the following harmonic series for a given value of n:
1+1/2+1/3+…+ 1/n  */
import java.util.*;
public class pro14 {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value for harmoinc series:");
        n=sc.nextInt();
        double sum = harmonicSeries(n);
        System.out.println("The approximate sum of the harmonic series for n = " + n + " is: " + sum);
    }

    public static double harmonicSeries(int n) {
        double k = 0.57721;
        double ln = 0;
        for (int i = 1; i <= n; i++) {
            ln += 1.0 / i;
        }
        return ln + k;
    }
}