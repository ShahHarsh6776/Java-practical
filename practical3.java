import java.util.Scanner;
class practical3
    {
        public static void main(String[] args)
        {
            String mo;
            System.out.println("Enter your mobile number");
            Scanner obj = new Scanner(System.in);
            mo = obj.nextLine();

            System.out.println("OP code : "+mo.substring(0,2));
            System.out.println("MSC code: "+mo.substring(2,6));
            System.out.println("UNIQUE code: "+mo.substring(6,10));
            System.out.println(" ");
        	System.out.println(" 23DIT068 HARSH UMESH SHAH ");
        }
    }