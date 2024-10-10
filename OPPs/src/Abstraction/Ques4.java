package Abstraction;

abstract class Animal{
    abstract void  eat();
    abstract void sleep();
}
class Lions extends Animal{
    void eat(){
        System.out.println("Lion Eats");
    }
    void sleep() {
        System.out.println("Lion Sleeps");
    }
}

class Tigers extends Animal{
    void eat(){
        System.out.println("Tigers Eats");
    }
    void sleep() {
        System.out.println("Tigers Sleeps");
    }
}


public class Ques4 {
    public static void main(String[] args) {
        Animal obj=new Lions();
        Animal obj2=new Tigers();
        obj.eat();
        obj.sleep();
        obj2.eat();
        obj2.sleep();
    }
}
