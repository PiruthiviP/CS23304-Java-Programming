/*Create a class ArrayUser with a 1-D array and 
length of the array. Create functions to : add: Adds two array, avg:
 Find the average of array elements, print: Print the array*/
 class ArrayUser {
    int[] arr;
    int length;

    ArrayUser(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    static int [] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    static double avg(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return  sum / a.length;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class pro36 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        ArrayUser user = new ArrayUser(arr1);

        int[] result = ArrayUser.add(arr1, arr2);
        System.out.println("Result of adding two arrays:");
        ArrayUser.print(result);

        double average = ArrayUser.avg(arr1);
        System.out.println("Average of arr1: " + average);

        ArrayUser.print(arr1);
        ArrayUser.print(arr2);
    }
}