class Mythread extends Thread {
    public void run() {
        System.out.println("This is a thread");
    }
    public void start(){
        System.out.println("Thread is starting");
    }
}

public class Thread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        System.out.println("this is a main thread");
    }
    
}
