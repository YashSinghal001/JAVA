import java.util.Scanner;

public class BinaryToDecimal {
     int binaryToDecimal(int n) {
        int d=0,i=0;
        while (n!=0){
            int r=n%10;
            n=n/10;
            d=d+r*(int)Math.pow(2,i++);
        }
        return  d;
    }


    public static void main(String[] args) {
        BinaryToDecimal obj=new BinaryToDecimal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n;
        n= sc.nextInt();
        int res=obj.binaryToDecimal(n);
        System.out.println("Binary To Decimal="+res);
    }
}
