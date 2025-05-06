package ss18_thread.thuc_hanh;

class MyClass extends Thread{
    public void run(){
        System.out.println("Thread đang chạy....");
    }
}

public class ExtendThread{
    public static void main(String[] args) {
        MyClass t  = new MyClass();
        t.start();
    }
}


