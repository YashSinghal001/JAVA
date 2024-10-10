

class  MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("My Thread 1: " + i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
//        System.out.println("This is my thread");
    }
}
public class Code4 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
