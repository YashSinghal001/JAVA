import java.util.Scanner;
public class Word {

    public static int CountWord(String str)
    {
        int count = 0;

            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;

        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print("Number of words in the string: " + CountWord(str)+"\n");
    }
}
