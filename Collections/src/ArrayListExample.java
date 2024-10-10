import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Phython");
        languages.add("Ruby");
        languages.add("MySQL");
        languages.add("Phython");
        languages.add("Springboot");

        //Array adjust automatically and length increase
        languages.add(5,"7");
//        IndexOutOfBoundsException
//        languages.add(20,"7");
        languages.remove("Java");
        languages.remove(2);
        System.out.println("languages list  contains 8 : " + languages.contains("8"));
        System.out.println("languages list  contains C : " + languages.contains("C"));
        System.out.println("The first occurrence of Phython in languages is at index : " + languages.indexOf("Phython"));
        System.out.println("The last occurrence of Phython in languages is at index : " + languages.lastIndexOf("Phython"));


        for (String i : languages) { // Fixed the typo here
            System.out.println(i);
        }
    }
}
