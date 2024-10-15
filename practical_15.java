import java.util.Scanner;
class practical_15
{
    public static void main(String[] args)
    {
        System.out.println("***************************");
        complex1 c1 = new complex1();
        c1.getdetails();
        Scanner s = new Scanner(System.in);
        System.out.println(":::::::MENU::::::");
        System.out.println(" SELECT ");
        System.out.println(" 1. For Addition of two complex number. ");
        System.out.println(" 2. For Subtraction of two complex number. ");
        System.out.println(" 3. For product of two complex number. ");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1:
                {
                    c1.getadd();
                    break;
                }
            case 2: 
            {
                c1.getdiff();
                break;
            }
            case 3:
                {
                    c1.getpro();
                    break;
                }
            default :
            {
                System.out.println(" Appropriate option not selected. ");
            }
        }
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
class complex1
{
    Scanner sc = new Scanner(System.in);
    private Double real1,imag1,real2,imag2;
    public void getdetails()
    {
        System.out.println("Enter real part of first complex number");
        real1 = sc.nextDouble();
        System.out.println("Enter Imaginery part of first complex number");
        imag1 = sc.nextDouble();
        System.out.println("Enter real part of second complex number");
        real2 = sc.nextDouble();
        System.out.println("Enter Imaginery part of second complex number");
        imag2 = sc.nextDouble();
    }
    public void getadd()
    {
        Double r,i;
        r = real1+real2;
        i = imag1+imag2;
        dis(r,i);
    }
    public void getdiff()
    {
        Double r,i;
        r = real1-real2;
        i = imag1-imag2;
        dis(r,i);
    }
    public void getpro()
    {
        Double r,i;
        r = (real1*real2)-(imag1*imag2);
        i = (real1*imag2)+(imag1*real2);
        dis(r,i);
    }
    public void dis(Double r,Double i)
    {
        System.out.println("Final Complex number is : "+r+"+i"+i);
        System.out.println(" ");
        System.out.println(" 23DIT068 HARSH UMESH SHAH ");
    }
}