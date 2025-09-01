package threads;

public class ThreadStates extends Thread {
    @Override
    public void run() {
        System.out.println("testing");      // running
        try {
            Thread.sleep(2000);        // paused for 2 sec
            System.out.println("released");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStates t = new ThreadStates();
        System.out.println(t.getState());       //NEW new thread is created
        t.start();
        System.out.println(t.getState());       // RUNNABLE ready to run, it can also considered as Running
        Thread.sleep(1000);                // the other thread is paused for 2 sec and it will come back this thread is pase for 1 sec
        System.out.println(t.getState());       //TIME-WAITING -  becases both the threads are paused
        t.join();                               // this method will wait for the threads to finsh its tasks
        System.out.println(t.getState());       // TERMINATED - tasks are completed in the threads
    }


}
