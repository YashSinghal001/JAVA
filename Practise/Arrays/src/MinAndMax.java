import java.util.Scanner;

public class MinAndMax {
    public static int Maximum(int arr[]) {
        int max = arr[0];  // Initialize max to the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max=arr[i];
            }
        }

        return max;
    }

    public static int Minimum(int arr[]) {
        int min = arr[0];  // Initialize min to the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " +n+ " Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Maximum(arr);
        System.out.println("Maxinmum Value="+max);
        int min=Minimum(arr);
        System.out.println("Minimun Value="+min);
    }
}
