import java.util.Scanner;

public class practical_24 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the first integer (a): ");
        double a = sc.nextInt();

        System.out.print("Enter the second integer (b): ");
        double b= sc.nextInt();
        try {
          double result = divide(a,b);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
    public static double divide(double a, double b) throws ArithmeticException 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
