package threads;

public class Test {
    public static void main(String[] args) {
//        System.out.println("hello world");
        // whenever we run the java class a main thread will start and runs the main method
        System.out.println(Thread.currentThread().getName());


        World world = new World();
        world.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("hello");
        }
    }
}
