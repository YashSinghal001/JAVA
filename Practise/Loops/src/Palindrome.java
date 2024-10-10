import java.util.Scanner;
class Palindrome {
    public boolean PalindromeNumber(int x) {
        int d,rev=0;
        int num=x;
        while(x!=0){
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String args[]){
        Palindrome obj=new Palindrome();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean res=obj.PalindromeNumber(n);
        System.out.println("Palindrome Number="+res);

    }
}