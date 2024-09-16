/*Write a program to evaluate the following investment equation:
V= P(1+r)n  and print the tables which would give the value of V for various combination of the following values of P, n and r.
P: 1000, 2000,3000, … 10,000
r:  0.10, 0.11, 0.12, … 0.20
n: 1,2,3, … 10
P: principal amount, V: value of money at the end of n years. V=P(1+r); P = V recursively. i.e. the value of money at the end of first year becomes the principal amount for the next year and so on.
 */
public class pro31 {
    public static void main(String[] args) {
        System.out.println("Investment Table:");
        System.out.println("P\tR\tN\tV");

        for (double p = 1000; p <= 10000; p += 1000) {
            for (double r = 0.10; r <= 0.20; r += 0.01) {
                for (int n = 1; n <= 10; n++) {
                    double v = calculateInvestment(p, r, n);
                    System.out.printf("%.0f\t%.2f\t%d\t%.2f%n", p, r, n, v);
                }
            }
        }
    }

    public static double calculateInvestment(double p, double r, int n) {
        double v = p;
        for (int i = 1; i <= n; i++) {
            v = v * (1 + r);
        }
        return v;
    }
}