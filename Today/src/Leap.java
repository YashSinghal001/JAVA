import java.util.Scanner;

public class Leap {
    public static void leapYear(int a) {
        if (a % 4 == 0) {
            System.out.println("leap year");
        } else if (a % 100 == 0) {
            System.out.println("Leap Year");
        } else if (a % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year For Leap Year");
        int a= sc.nextInt();
        leapYear(a);
    }
}
