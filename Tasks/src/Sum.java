import java.util.Scanner;

public class Sum {
    public static int natural(int n) {
        int s=0;
        for (int i = 0; i <= n; i++) {
            s=s+i;
        }
        return  s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number");
        int n= sc.nextInt();
        int res=natural(n);
        System.out.println("Sum of Natural Number="+res);
    }
}
