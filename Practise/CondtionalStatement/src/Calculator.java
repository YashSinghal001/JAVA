import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1;
        System.out.print("Enter the A Numbers :");
        double num1 = in.nextDouble();
        System.out.print("Enter the B Numbers :");
        double  num2 = in.nextDouble();
        System.out.print("Choose an Operation to Perform. E.g.: +, -, *, /, ^ :");
        char  o = in.next().charAt(0);
        System.out.println("A Number = " + num1 );
        System.out.println("B Number = " + num2);
        System.out.println("Operator = " + o);
        System.out.print("Result : " +  num1+ o + num2 +  " = ");
        if(o=='+')
        {
            System.out.print(num1+num2);
        }
        else  if(o=='-')
        {
            System.out.print(num1-num2);
        }
        else if(o=='*')
        {
            System.out.print(num1*num2);
        }
        else  if(o=='/')
        {
            System.out.print(num1/num2);
        }
        else if(o=='^')
        {
            for(int i=1; i<=num2; i++){
                p *= num1;
            } System.out.print(p);
        }
        else
        {
            System.out.print("Invalid Operator.");
        }

    }
}