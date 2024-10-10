

import java.io.File;

public class Deleted {
    public static void main(String[] args) {
        File file1 = new File("Yash.html");
        if(file1.delete()) {
            System.out.println("file deleted");
        }
        else{
            System.out.println("file not Delete");
        }
    }
}