import java.util.Scanner;

public class Pattern2 {
    void PatternCount(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 obj=new Pattern2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        obj.PatternCount(n);
    }
}

