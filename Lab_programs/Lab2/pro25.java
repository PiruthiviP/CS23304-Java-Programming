/*
 Modify the Floyd’s triangle to produce the following
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */

 public class pro25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 1 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
