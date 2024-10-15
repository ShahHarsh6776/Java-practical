import java.util.Scanner;
class practical_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,p;
        int n,i,nu,ne;
        System.out.println("Enter any string value");
        name = sc.nextLine();
        System.out.println("Enter any number");
        n = sc.nextInt();
        nu=name.length();
        if(n>nu)
        {
            ne=nu;
        }
        else{
            ne=n;
        }
        for(i=0;i<n;i++)
        {
            p=name.substring(0,ne);
            System.out.println(p);
        }
        System.out.println("\n  23DIT068  SHAH HARSH UMESHKUMAR ");
    }
}