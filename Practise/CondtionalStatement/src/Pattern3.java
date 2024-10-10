import java.util.Scanner;

public class Pattern3 {
    void PatternCount(int n) {
        for (int i = n; i >=1; i--) {
            for (int j =n; j>= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern3 obj=new Pattern3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        obj.PatternCount(n);
    }
}

