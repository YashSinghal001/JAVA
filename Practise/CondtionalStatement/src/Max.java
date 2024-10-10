import java.util.Scanner;

public class Max {
    public static void MaxNumber(int a, int b, int c) {
        if (a >= b && b >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third  number");
        int c = sc.nextInt();
        System.out.println("Geatest Number");
        MaxNumber(a, b, c);
    }
}
