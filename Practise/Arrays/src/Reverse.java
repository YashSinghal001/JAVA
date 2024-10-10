import java.util.Scanner;

public class Reverse {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static int[] reverse(int arr[]) {
        int j=0;
        for (int i = arr.length-1 ;i >=0 ; i--) {
            arr[j++]=arr[i];
        }
        return  arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Reverse Array");
        reverse(arr);
        printArray(arr);
    }
}
