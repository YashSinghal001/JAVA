package Inheritancee;

interface Human{
    int a=20;
    void Name();
}
interface Animal{
    int b=30;
    void Species();
}

class Property implements Human,Animal{
    public void Name(){
        System.out.println("Sagar");
    }
    public  void Species(){
        System.out.println("Monkey");
    }
}

public class Class2 {
    public static void main(String[] args) {
        Property obj=new Property();
        obj.Name();
        obj.Species();
    }
}
