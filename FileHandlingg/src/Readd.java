


import java.io.*;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readd {
    public static void main(String[] args) {
        File obj1 = new File("Yash.html");
        try{
            Scanner sc = new Scanner(obj1);
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
//            System.out.println("File not found: " + obj1.getName());
            e.printStackTrace();
        }
    }
}
