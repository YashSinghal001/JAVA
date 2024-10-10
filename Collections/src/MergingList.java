import java.util.*;

public class MergingList {
    public static void main(String[] args) {
        ArrayList<String> languages1 = new ArrayList<>();
        ArrayList<String> languages2 = new ArrayList<>();
        languages1.add("C");
        languages1.add("C++");
        languages1.add("Java");
        languages1.add("Phython");

        languages2.add("Oracle");
        languages2.add("Ruby");
        languages2.add("MySQL");
        languages2.add("Springboot");
        System.out.println(languages1);
        System.out.println(languages2);
languages1.addAll(languages2);
///merg
        System.out.println("Merging of languages="+languages1);

    }
}
