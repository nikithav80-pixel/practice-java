public class counter {
    private int count = 0;
    public void increment() {
        count++;
    }
    public int getCount()   {
        return count;
    }
    
}
class ThreadDemo extends Thread{
    counter Counter;
    
    ThreadDemo(counter Counter){
        this.Counter=Counter;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            Counter.increment();
        }
    }
}
public class Synchronization{
    public  static void main(String[] args) throws InterruptedException{
        counter Counter = new counter();
        ThreadDemo t1 = new ThreadDemo(Counter);
        ThreadDemo t2 = new ThreadDemo(Counter);
        
        try{
            t1.wait();
            t2.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.notify();
        t2.notify();

        System.out.println("FinalCount: " + Counter.getCount());
    }
}
