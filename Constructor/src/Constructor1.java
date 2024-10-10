 class Constructor {
     String name;
     int age;

     public Constructor(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public void printMethod() {
         System.out.println("Name=" + name);
         System.out.println("Age=" + age);

     }
 }
    public class Constructor1
    {
        public static void main(String[] args) {
            Constructor obj=new Constructor("Yash",001);
                    obj.printMethod();
        }
    }

