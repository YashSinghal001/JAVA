import java.util.Random;
import java.util.Scanner;

public class RockPareAdndScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of your Choice ");
        System.out.println("0:Rock");
        System.out.println("1:Paper");
        System.out.println("2:Scissor");

        int userInput= sc.nextInt();
        Random random=new Random();
        int computerInput= random.nextInt(3);
        if (computerInput==userInput)
        {
            System.out.println("Draw");
        }
        else if (computerInput==0 && userInput==1 || computerInput==1 && userInput==2 || computerInput==2 && userInput==0)
        {
            System.out.println("UserWins="+userInput);
        }
        else
        {
            System.out.println("ComputerWins!");
        }
        System.out.println("Computer choice is ="+ computerInput);
        if (computerInput==0){
            System.out.println("Computer Choose Rock");
        }
        else if (computerInput==1)
        {
            System.out.println("Computer Choose Paper");
        }
        else {
            System.out.println("Computer Choose Scissor");
        }
    }
}
