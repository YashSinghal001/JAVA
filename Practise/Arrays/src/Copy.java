import java.util.Scanner;

public class Copy {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void copyArray(int arr[]) {
        int arr2[]=arr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+ " Element");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Copy Array");
        copyArray(arr);
//        printArray(arr);
    }
}
