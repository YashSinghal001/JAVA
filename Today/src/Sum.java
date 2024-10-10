import java.util.Scanner;

public class Sum {
    public static int natural(int n) {
        int result = 0;

        while(n != 0) {
            result =result+ n % 10;
            n=n / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number");
        int n= sc.nextInt();
        int res=natural(n);
        System.out.println("Sum of Natural Number="+res);
    }
}
