import java.util.Scanner;

public class FibonaccicSeries {
    void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        FibonaccicSeries obj=new FibonaccicSeries();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        obj.fibonacciSeries(n);

    }
}
