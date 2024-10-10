class Animal1{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog1 extends Animal1{
    @Override
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat1 extends Animal1{
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }
}
public class RunTimeOverriding {
    public static void main(String[] args) {
        Animal1 animal = new Dog1();
        animal.eat(); // Output: Dog is eating

        animal = new Cat1();
        animal.eat(); // Output: Cat is eating
    }
}