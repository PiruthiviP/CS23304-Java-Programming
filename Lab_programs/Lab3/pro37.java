//Demonstrate the working of the above functions by creating two ArrayUser objects. 
class ArrayUser {
    int[] arr;
    int length;

    ArrayUser(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    static int[] add(int[] a, int[] b) {
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
        return (double) sum / a.length;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class Pro36 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        ArrayUser user1 = new ArrayUser(arr1);
        ArrayUser user2 = new ArrayUser(arr2);

        System.out.println("ArrayUser 1:");
        ArrayUser.print(user1.arr);
        System.out.println("Average of ArrayUser 1: " + ArrayUser.avg(user1.arr));

        System.out.println("ArrayUser 2:");
        ArrayUser.print(user2.arr);
        System.out.println("Average of ArrayUser 2: " + ArrayUser.avg(user2.arr));

        int[] result = ArrayUser.add(user1.arr, user2.arr);
        System.out.println("Result of adding ArrayUser 1 and ArrayUser 2:");
        ArrayUser.print(result);

        System.out.println("Average of result: " + ArrayUser.avg(result));
    }
}

