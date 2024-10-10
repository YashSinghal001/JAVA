import java.util.Arrays;
import java.util.Scanner;

public class remove {
    public static int duplictaes(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(a);

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        n = duplictaes(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


    }
}