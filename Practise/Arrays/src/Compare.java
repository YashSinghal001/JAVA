import java.util.Scanner;

public class Compare {public static boolean Equal(int[] arr, int x) {
    for(int i = 0; i < arr.length; ++i) {
        if (arr[i] == x) {
            return true;
        }
    }

    return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter " + n + " Element");

        int x;
        for(x = 0; x < arr.length; ++x) {
            arr[x] = sc.nextInt();
        }

        System.out.println("Enter the Element to Search");
        x = sc.nextInt();
        boolean res = Equal(arr, x);
        System.out.println(res);
    }
}

