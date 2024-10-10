abstract class Animal{
    abstract void  eat();
    abstract void sleep();
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion Eat");
    }
    void sleep(){
        System.out.println("Lion sleep");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger Eat");
    }
    void sleep(){
        System.out.println("Tiger sleep");
    }
}

class  Deer extends Animal{
    void eat(){
        System.out.println("Deer Eat");
    }
    void sleep(){
        System.out.println("Deer sleep");
    }
}

public class Ques1 {
    public static void main(String[] args) {
  Lion obj= new Lion();
  Tiger obj2=new Tiger();
  Deer obj3=new Deer();
  obj.eat();
  obj.sleep();
  obj2.eat();
  obj2.sleep();
  obj3.eat();
  obj3.sleep();

    }
}
