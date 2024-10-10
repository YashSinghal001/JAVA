


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writee {
    public static void main(String[] args) {
//        File obj1  = new File("Shivang4.html");
//        if(obj1.exists()){
//            System.out.println("File already exists");
//        }
//        else{
//            System.out.println("File not exists");
//        }
        try{
            FileWriter writer = new FileWriter("Yash.html");
            writer.write("<html>\n" +
                    "    <head>\n" +
                    "        <title>Yash's HTML File</title>\n" +
                    "    </head>\n" +
                    "    <body>\n" );
            writer.write("        <h1>Hello World!</h1>\n" +
                    "        <p>This is a simple HTML file.</p>\n" +
                    "    </body>\n" +
                    "</html>");
//            obj1.createNewFile();
//            System.out.println("File created");

writer.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
