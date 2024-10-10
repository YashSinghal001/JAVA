import java.util.Scanner;

public class Sorting {

    public static void printOrignalArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sorting(int arr[]) {
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                //acsending
            if (arr[j] > arr[j+1])
            {
               temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

            }
        }

return  arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter " + n +" element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Original Array");
        printOrignalArray(arr);
        System.out.println("Sorted Array");
        sorting(arr);
        //It return Address
//        int res[]= sorting(arr);
//        System.out.println(res);

        //Why it is neccessary ->
        printOrignalArray(arr);


    }
}
