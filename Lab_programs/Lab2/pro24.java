/*
 Write a program to print the Floyd’s triangle.
1
2 3
4 5 6
7 8 9 10
11  12 …  15
.
79  …	91
 */

 public class pro24 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
