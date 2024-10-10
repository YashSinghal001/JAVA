package Inheritance;

class Employee {
    void salary() {
        System.out.println("Salary=" + 30000);
    }
}

class Developers extends Employee {
    void bonus() {
        System.out.println("Bonus=" + 10000);
    }
}

public class Salary {
    public static void main(String[] args) {
        Developers obj = new Developers();
        obj.bonus();
        obj.salary();
    }
}