package ss18_thread.thuc_hanh;

 class MyClass1 implements Runnable{
    public void run(){
        System.out.println("Thread đang chạy...");
    }
}

public class RunnableInterface{
    public static void main(String[] args) {
        Thread t = new Thread(new MyClass1());
        t.start();
    }
}
