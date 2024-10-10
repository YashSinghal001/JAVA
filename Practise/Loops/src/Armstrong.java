import java.util.Scanner;

public class Armstrong {
     void ArmstrongNumber(int n) {
        int d,s=0;
        int num=n;
        while (n!=0){
            d=n%10;
           s=s+(d*d*d);
           n=n/10;
         }
        if (s==num){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Armstrong obj=new Armstrong();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        obj.ArmstrongNumber(n);
    }
}
