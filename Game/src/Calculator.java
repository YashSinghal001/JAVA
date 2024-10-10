import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float res = 0;
        System.out.println("Enter your operator +,-,*,/,% ");
        char op = sc.next().charAt(0);
        System.out.println("Enter your first Number: ");
        float a = sc.nextFloat();
        System.out.println("Enter your second Number: ");
        float b = sc.nextFloat();
        switch (op) {
            case '+':
                res = a + b;
                System.out.println("The result is: " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("The result is: " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("The result is: " + res);
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                    System.out.println("The result is: " + res);
                } else {
                    System.out.println("Can't divide by zero");
                }
                break;
            case '%':
                res = a % b;
                System.out.println("The result is: " + res);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}