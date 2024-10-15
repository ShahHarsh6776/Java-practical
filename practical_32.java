import java.util.Scanner;

class SumTask implements Runnable {
    private int start;
    private int end;
    private int[] result;

    public SumTask(int start, int end, int[] result) {
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        result[0] += sum;
    }
}

public class practical_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter number of threads: ");
        int numThreads = scanner.nextInt();

        int[] result = {0};
        int range = N / numThreads;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i == numThreads - 1) ? N : start + range - 1;
            threads[i] = new Thread(new SumTask(start, end, result));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Sum of first " + N + " natural numbers is: " + result[0]);
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
        scanner.close();
    }
}

