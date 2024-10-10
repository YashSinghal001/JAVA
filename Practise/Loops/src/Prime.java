import java.util.Scanner;

public class Prime {
    public static void primeNumber(int n) {
        int c=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
            {
                c++;
            }
        }
        if (c==2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Primer Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n;
        n=sc.nextInt();
        System.out.println("Prime Number of " + n );
        primeNumber(n);
    }
}
