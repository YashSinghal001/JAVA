

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createe {
    public static void main(String[] args) {

        try{
        File obj1  = new File("Yash.html");
        if(obj1.exists()){
            System.out.println("File already exists");
        }
        else{
            System.out.println("File not exists");
        }
            obj1.createNewFile();
            System.out.println("File created");



        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

