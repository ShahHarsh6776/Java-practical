import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private final Random random;
    private final SharedData sharedData;

    public RandomNumberGenerator(SharedData sharedData) {
        this.random = new Random();
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            int number = random.nextInt(100); // Generates a random integer between 0 and 99
            sharedData.setNumber(number);
            System.out.println("Generated: " + number);
            if (number > 1000) {
                sharedData.stop(); // Signal to stop other threads
                break;
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SquareCalculator implements Runnable {
    private final SharedData sharedData;

    public SquareCalculator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            if (sharedData.isStopped()) {
                break; // Stop if signaled
            }
            int number = sharedData.getNumber();
            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            }
            try {
                Thread.sleep(100); // Slight delay to allow the generator to produce new numbers
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class CubeCalculator implements Runnable {
    private final SharedData sharedData;

    public CubeCalculator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            if (sharedData.isStopped()) {
                break; // Stop if signaled
            }
            int number = sharedData.getNumber();
            if (number % 2 != 0) {
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is: " + cube);
            }
            try {
                Thread.sleep(100); // Slight delay to allow the generator to produce new numbers
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SharedData {
    private int number;
    private boolean stopped = false;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void stop() {
        this.stopped = true;
    }

    public synchronized boolean isStopped() {
        return stopped;
    }
}
public class practical_33 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread generatorThread = new Thread(new RandomNumberGenerator(sharedData));
        Thread squareThread = new Thread(new SquareCalculator(sharedData));
        Thread cubeThread = new Thread(new CubeCalculator(sharedData));

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
