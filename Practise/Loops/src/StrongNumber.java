import java.util.Scanner;

public class StrongNumber {
    public static void strongNumber(int n) {
        int num=n;
        int d,s=0;
        while (n!=0)
        {
           d=n%10;
           // why we put  int f=1; here only
           int f=1;
            for (int i = 1; i <=d ; i++) {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
            if (s==num)
            {
                System.out.println("Strong Number");
            }
            else {
                System.out.println("Not a Strong Number");
            }

    }
//public static void strongNumber(int n) {
//    int num = n;
//    int sum = 0;
//
//    while (n != 0) {
//        int digit = n % 10;
//        int factorial = 1;
//
//        for (int i = 1; i <= digit; i++) {
//            factorial *= i;
//        }
//
//        sum += factorial;
//        n /= 10;
//    }
//
//    if (sum == num) {
//        System.out.println("Strong Number");
//    } else {
//        System.out.println("Not a Strong Number");
//    }
//}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Whether a Strong Number or Not ");
        int n;
        n=sc.nextInt();
        strongNumber(n);

    }
}
