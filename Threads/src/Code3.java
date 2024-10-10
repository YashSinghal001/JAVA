class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(i + " " + Thread.currentThread().getName() +  "Thread is running");
            Thread.yield();//for sequence
        }
    }
}
public class Code3 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}