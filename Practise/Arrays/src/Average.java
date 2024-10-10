import java.util.Scanner;

public class Average {
    public static int average(int arr[]) {
        int sum=0,avg=0;
        for (int i = 0; i< arr.length ; i++) {
           sum=sum+arr[i];
           avg=sum/arr.length;
        }
        return avg;
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

        int res=average(arr);
        System.out.println("Avgerage="+res);

    }
}
