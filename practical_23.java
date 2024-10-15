import java.util.Scanner;

public class practical_23 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        try {
            System.out.print("Enter the first integer (x): ");
            int x = sc.nextInt();

            System.out.print("Enter the second integer (y): ");
            int y = sc.nextInt();

            double res = x / y;
   
            System.out.println(" x / y  =  " + res);
        } 
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } 
        sc.close();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
