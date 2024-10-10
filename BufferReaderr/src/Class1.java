
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1 {
    public static void main(String[] args) {
        // Wrap InputStreamReader in a BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read input as a string and convert it to an integer
            int a = Integer.parseInt(reader.readLine());
            System.out.println(a);
            int b = Integer.parseInt(reader.readLine());
            System.out.println(b);
            int sum = a + b;
            System.out.println(sum);
        } catch (IOException e) {
            // Handle potential IOException
            e.printStackTrace();
        }
    }
}
