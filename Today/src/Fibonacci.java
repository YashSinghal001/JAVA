import java.util.Scanner;

public class Fibonacci {
    public static void FibonacciSeries(int n) {
        int firstnum=0;
        int secnum=1;
        System.out.print(firstnum + ", ");
        for (int i=0;i<n;++i){
            int nextTerm = firstnum + secnum;
            System.out.print(secnum + ", ");
            firstnum = secnum;
            secnum = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number");
        int n= sc.nextInt();
        FibonacciSeries(n);
    }
}