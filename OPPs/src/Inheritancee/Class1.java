package Inheritancee;

interface fun{
    int a =  20;
    void show();
}
interface fun1{
    int a1 =  40;
    void show1();
}
class MyClass implements fun,fun1{

    public void show(){
        System.out.println("Hello from show()" +  a);
    }
    public void show1(){
        System.out.println("Hello from show1()" +  a1);
    }
}
public class Class1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show(); // Output: Hello from show()
        obj.show1(); // Output: Hello from show1()
    }
}