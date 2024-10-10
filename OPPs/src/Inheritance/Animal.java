package Inheritance;

public class Animal {

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.Eat();
        obj.Bark();

    }
    }

class Animals{
    void Eat(){
        System.out.println("Inheritance.Animal Eat");
    }
}

class Dog extends Animals{
    void Bark(){
        System.out.println("Inheritance.Dog ");
    }


}
