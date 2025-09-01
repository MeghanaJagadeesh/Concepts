package threads;

public class Synchronize extends Thread {

    Counter counter;

    Synchronize(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

class SyncTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Synchronize synchronize1 = new Synchronize(counter);
        Synchronize synchronize2 = new Synchronize(counter);

        synchronize2.start();
        synchronize1.start();

        synchronize1.join();
        synchronize2.join();
        System.out.println(counter.getCount());
    }
}

class Counter {
    int count = 0;

//    public synchronized void increment() {
//        count++;
//    }

//    OR

    public void increment() {
       synchronized (this){
           count++;
       }
    }

    public int getCount() {
        return count;
    }
}
