
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Code1 {
    public static void main(String[] args) {
        try{
            File file = new File("Shivang.txt");
            FileReader reader = new FileReader(file);
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred: " + e.getMessage());

        }


    }
}