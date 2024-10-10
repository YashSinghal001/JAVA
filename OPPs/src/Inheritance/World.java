package Inheritance;

class  India{
    void Delhi(){
        System.out.println("Red Fort");
    }
    class Monuments1 extends India {
        void Mumbai() {
            System.out.println("Gateway of India.");
        }
    }
        class Monument2 extends  India{
            void  Agra(){
                System.out.println("Taj Mahal");
            }
        }

}


public class World {
    public static void main(String[] args) {
//        Monument2 obj=new Monument2();
//        obj.Agra();
//        obj.Delhi();
//        obj.Mu
    }
}
