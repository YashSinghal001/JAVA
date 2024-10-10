import java.util.Scanner;

public class Factorial {
    public static int factorialNumber(int n) {
        int f=1;
        for (int i = n; i >0 ; i--) {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n;
        n=sc.nextInt();
        int res=factorialNumber(n);
        System.out.println("Factorial="+ res);
    }
}
