public class practical_35 {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new Task(), "FIRST");
        Thread secondThread = new Thread(new Task(), "SECOND");
        Thread thirdThread = new Thread(new Task(), "THIRD");

        // Set priorities
        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY); // Default is 5
        thirdThread.setPriority(7);

        // Start threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
