package Inheritance;

public class Vechiles {
    public static void main(String[] args) {
        Swift obj1=new Swift();
        Verna obj2=new Verna();
        Thar obj3=new Thar();
        MercedesMaybach obj4=new MercedesMaybach();
        BMWXM obj5=new BMWXM();
        obj1.Car();
        obj1.Tata();
        obj2.Mahindra();
        obj3.Mahindraa();
        obj4.Mercedes();
        obj5.BMW();
        obj4.Wheel();
        obj1.Engine();
    }
}
class VechileBrand{
    void Car()
    {
        System.out.println("Various Car Models:-");
    }
    void  Wheel(){
        System.out.println("4 Wheels");
    }
    void Engine(){
        System.out.println("Engine");

    }
}

class Swift extends VechileBrand{
    void Tata(){
        System.out.println("Inheritance.Swift");
    }
}
class  Verna extends VechileBrand{
    void  Mahindra(){
        System.out.println("Inheritance.Verna");
    }
}
class  Thar extends VechileBrand{
    void  Mahindraa(){
        System.out.println("Inheritance.Thar");
    }
}

class  MercedesMaybach extends VechileBrand{
    void  Mercedes(){
        System.out.println("Mercedes Maybach");
    }
}

class  BMWXM extends VechileBrand{
    void  BMW(){
        System.out.println("BMW XM");
    }
}
