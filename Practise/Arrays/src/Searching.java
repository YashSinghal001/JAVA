import java.util.Scanner;

public class Searching {
    public static int searchingArray(int arr[],int x) {
        int ans=-1;
        for (int i = 0; i< arr.length ; i++) {
            if (arr[i]==x)
            {
                ans=i;
            }
        }
        return ans;
    }//

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n;
        n=sc.nextInt();
        System.out.println("Enter " + n + " Elemet");
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value to be Search");
        int x;
        x= sc.nextInt();
        int res=searchingArray(arr,x);
        System.out.println("Index="+res);

    }
}
