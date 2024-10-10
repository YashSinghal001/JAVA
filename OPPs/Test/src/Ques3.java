class Animal1{
    void move(){
        System.out.println("Animal Move");
    }
    void makeSound(){
        System.out.println("Animal MakeSound");
    }
}
class Bird extends Animal1{
    @Override
    void move() {
        System.out.println("Bird Move");
    }

    @Override
    void makeSound() {
        System.out.println("Bird MakeSound");
    }
}

class Panthera extends Animal1{
    @Override
    void move() {
        System.out.println("Panthera MOve");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera MakeSound");
    }
}

public class Ques3 {
    public static void main(String[] args) {
Bird obj1=new Bird();
Panthera ob2=new Panthera();
obj1.move();
obj1.makeSound();
ob2.move();
ob2.makeSound();
    }
}
