import java.util.ArrayDeque;

public class ArrayDeuuqExample {
    public static void main(String[] args) {
        ArrayDeque<String> obj=new ArrayDeque<>();
        obj.add("First");
        obj.add("Second");
        obj.add("Third");
        obj.add("Fourth");


        obj.remove("Third");

        String firstElement = obj.removeFirst();
        String lastElement = obj.removeLast();

        for (String i : obj) {
            System.out.println(i);
        }


    }
}
