package Abstraction;

abstract class Animal1{
    abstract void sound();
}

class Lion extends Animal1{
    void sound(){
        System.out.println("Sound of Lion");
    }
}
class Tiger extends Animal1{
    void sound(){
        System.out.println("Sound of Tiger");
    }
}



public class Animals {
    public static void main(String[] args) {
   Animal1 obj=new Lion();
   Animal1 obj2=new Tiger();
   obj.sound();
   obj2.sound();
    }
}
