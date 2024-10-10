class InterFacee implements Runnable
{
   public void run(){
        for (int i = 0; i <=5; i++) {
            System.out.println("Yash="+i);
            System.out.println("Yash");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Code2 {
    public static void main(String[] args) {
InterFacee obj=new InterFacee();
Thread t1=new Thread(obj);
t1.start();
    }
}
