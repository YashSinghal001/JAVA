import java.util.Scanner;

public class Naturalnum {

    public static void ReverseNatural (int n) {
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n;
        n= sc.nextInt();
        ReverseNatural(n);
    }
}
