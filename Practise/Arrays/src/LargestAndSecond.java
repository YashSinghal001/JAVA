import java.util.Scanner;

public class LargestAndSecond {
    public static int largestElement(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondElement(int arr[]) {
        int max=largestElement(arr);
        int i;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        i=largestElement(arr);
        return  i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entyer the size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int max=largestElement(arr);
        System.out.println("First largest="+max);
        int secmax=secondElement(arr);
        System.out.println("Secondlargest="+secmax);

    }
}
