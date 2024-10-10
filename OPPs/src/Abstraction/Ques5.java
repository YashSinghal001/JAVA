package Abstraction;

 abstract class Employee{
    abstract void calculateSalary();
    abstract void displayInfo();
 }

 class Manager extends Employee{
     void calculateSalary() {
         System.out.println("Manager Salary="+30000);
     }
     void displayInfo() {
         System.out.println("Manager name="+"Atul");
         System.out.println("Age="+30);
     }
 }

class Programmer  extends Employee{
    void calculateSalary() {
        System.out.println("Programmer Salary="+50000);
    }
    void displayInfo() {
        System.out.println("Programmer name="+"Ajay");
        System.out.println("Age="+20);
    }
}



public class Ques5 {
    public static void main(String[] args) {
 Employee obj1=new Manager();
 Employee obj2=new Programmer();
 obj1.displayInfo();
 obj1.calculateSalary();
 obj2.displayInfo();
 obj2.calculateSalary();
    }
}
