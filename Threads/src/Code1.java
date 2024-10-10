

class Number extends Thread{
    public void run(){
        printNumber();
    }
    void printNumber() {
        for(int i=1; i<=5; i++){
            System.out.println("Number " + i);
            try { Thread.sleep(500); }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}class Letters extends Thread{
    public void run(){
        printLetters();
    }
    void printLetters() {
        for(char i='A'; i<='E'; i++){
            System.out.println("Letter " + i);
            try { Thread.sleep(500); }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
public class Code1 {
    public static void main(String[] args) {
        Number number = new Number();
        Letters letters = new Letters();
        number.start();
        letters.start();

    }
}
