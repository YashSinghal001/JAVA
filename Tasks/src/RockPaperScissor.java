import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of your Choice ");
        System.out.println("0:Rock");
        System.out.println("1:Paper");
        System.out.println("2:Scissor");

//    int Rock=0;
//    int Paper=1;
//    int Scissor=2;
        int userInput= sc.nextInt();
        //random value can be assign for game from three value
        Random random=new Random();
        int computerInput= random.nextInt(3);
        //main logic
        if (computerInput==userInput)
        {
            System.out.println("Draw");
        }
        // we try user to be win the game
        else if (computerInput==0 && userInput==1 || computerInput==1 && userInput==2 || computerInput==2 && userInput==0)
        {
            System.out.println("UserWins!="+userInput);
        }
      else
        {
            System.out.println("ComputerWins!");
        }
        //      for user choise

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

//      for user choise

//        System.out.println("User choice is");
//        if (computerInput==0){
//            System.out.println("User Choose Rock");
//        }
//        else if (computerInput==1)
//        {
//            System.out.println("User Choose Paper");
//        }
//        else {
//            System.out.println("User Choose Scissor");
//        }




    }
}
