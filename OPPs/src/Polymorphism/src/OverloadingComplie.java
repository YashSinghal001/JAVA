class Calculator{
    public  int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return  a+b+c;
    }
}


public class OverloadingComplie {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(obj.add(3, 5));
        System.out.println(obj.add(3,5,9));    }
}
