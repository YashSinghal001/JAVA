import java.util.Scanner;

public class Cube {
    public static int cubeNumber(int n) {
        int cube=0;
        for (int i = 0; i < n; i++) {
            cube=(int)Math.pow(n,i);
        }
        return cube;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n;
        n=sc.nextInt();
        int res=cubeNumber(n);
        System.out.println("Cube="+res);
    }
}
