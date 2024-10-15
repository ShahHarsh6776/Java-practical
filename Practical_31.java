// Implement the Runnable interface
class HelloWorldRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }
}

class helloclass extends Thread
{
    public void run()
    {
        System.out.println("Hello world");
    }
}

public class Practical_31 {
    public static void main(String[] args) {
        HelloWorldRunnable runnable = new HelloWorldRunnable();
            Thread thread = new Thread(runnable);
            thread.start();
        helloclass h = new helloclass();
        h.start();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}