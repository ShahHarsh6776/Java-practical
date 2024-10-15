public class practical_34 {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        Thread thread = new Thread(incrementer);
        thread.start();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}

class Incrementer implements Runnable {
    private int value = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1 second
            value++; // Increment the value by one
            System.out.println("Incremented value: " + value);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
    }
}