package threads;

public class MyThread extends Thread {
    // to give a name to the thread.. it calls its super class to set the name
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread running");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "-> " + i);
                Thread.sleep(1000);         //2. sleep() will stop the execution for some time
                Thread.yield();                   //5. whenver we are running multiple threads it gives hint to give a chance to other thread as well
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interupted...");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread("mythread-1");
        thread.start();         // 1. Thread get started
        System.out.println(thread.getState());
//        thread.join();          //3. join() will wait for other Thread to complete the task
        System.out.println("Thread completed ");

//        thread.interrupt();

        MyThread thread1 = new MyThread("mythread-2");
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);       //4. set the priority to based on the requirement by default the thread priority is 5 (normal priority)

        ThreadTest test = new ThreadTest();
        test.setDaemon(true);        //6.  if we set any thread as a daemon thread it will be running in background and jvm will not wait for this thread to finish its task
        test.start();
        System.out.println("main");
    }
}

class ThreadTest extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello");
        }
    }
}