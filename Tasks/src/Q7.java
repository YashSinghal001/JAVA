import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Element");
        int array1[]=new int[n];
        int array2[]=new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i]= sc.nextInt();
            array2[i]= sc.nextInt();
        }
        printArrays(array1, array2);
        findAndPrintCommonElements(array1, array2);
    }

    public static void printArrays(int[] arr1, int[] arr2) {
        System.out.println("Array1 : " + Arrays.toString(arr1));
        System.out.println("Array2 : " + Arrays.toString(arr2));
    }

    public static void findAndPrintCommonElements(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element is : " + arr1[i]);
                }
            }
        }
    }
}