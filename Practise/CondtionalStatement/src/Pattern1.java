import java.util.Scanner;

public class Pattern1 {
    void PatternCount(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 obj=new Pattern1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        obj.PatternCount(n);
    }
}
