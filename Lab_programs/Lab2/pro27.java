/*Write a program that will read the values of x and evaluate the following function:
Y ={ 	1 for x> 0; 	 0 for x= 0; 		-1 for x< 0	}
Using i) nested if statements, ii) else if statements and iii) conditional operator. */
public class pro27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        int y;

        if (x > 0) {
            y = 1;
        } else {
            if (x == 0) {
                y = 0;
            } else {
                y = -1;
            }
        }

        System.out.println("Y = " + y);
    }
}


//2nd one
public class Pro27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        int y;

        if (x > 0) {
            y = 1;
        } else if (x == 0) {
            y = 0;
        } else {
            y = -1;
        }

        System.out.println("Y = " + y);
    }
}

//3rd one
public class Pro27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        int y = (x > 0) ? 1 : (x == 0) ? 0 : -1;

        System.out.println("Y = " + y);
    }
}