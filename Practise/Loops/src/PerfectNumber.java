import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(int n) {
        int s=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                s=s+i;
            }
        }
            if (s==n)
            {
                System.out.println("Perfect Number");
            }
            else {
                System.out.println("not Perfect Number");
            }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n;
        n=sc.nextInt();
        perfectNumber(n);
    }
}
