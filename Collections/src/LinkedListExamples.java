import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<>();
        obj.add("First");
        obj.add("Second");
        obj.add("Third");
        obj.add("Fourth");
        //Array adjust automatically and length increase

        obj.add(2,"60");

        obj.remove("Third");

        for (String i : obj) {
            System.out.println(i);
        }


    }
}
