import java.util.Scanner;

public class HCF {
   int hcfOfNumber(int a,int b) {
        int hcf=0;
        int min=a<b?a:b;
        for (int i = min; i>=1; i--) {
            if (a%i==0 && b%i==0)
            {
          hcf=i;
                break;
            }
//            System.out.println(HCF="+hcf);
        }
        return hcf;
    }

    public static void main(String[] args) {
    HCF obj=new HCF();
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enetr number a");
        a=sc.nextInt();
        System.out.println("enetr number b");
        b=sc.nextInt();
       int res=obj.hcfOfNumber(a,b);
        System.out.println(res);
    }
}

