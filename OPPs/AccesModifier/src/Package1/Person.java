package Package1;

import Package2.PersonSetGet;

public class Person {
    public static void main(String[] args) {
        PersonSetGet obj=new PersonSetGet();
        obj.SetAge(20);
        obj.SetName("Yash");
        System.out.println("Name: "+obj.GetName());
        System.out.println("Age:"+obj.GetAge());
    }
}