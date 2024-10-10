class  Person{
    void getFirstName(){
        System.out.println("Person Name");
    }
    void getLastName(){
        System.out.println("Peron LastName");
    }
}
class Employee extends Person{
    void getEmployeeId(){
        System.out.println("GetEmployee");
    }

    @Override
    void getLastName() {
        System.out.println("Employee Last Name");    }
}


public class Ques2 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.getLastName();
        obj.getEmployeeId();

    }
}
