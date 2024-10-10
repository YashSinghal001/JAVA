import java.util.Scanner;

public class commonelement {
    public static int commonElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    return  arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Element");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int res=commonElement(arr);
        System.out.println("Common Element="+res);
    }
}
