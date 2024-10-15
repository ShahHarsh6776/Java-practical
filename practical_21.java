interface adar
{
    int dsum(int n);
}

class mycalc implements adar
{

    public int dsum(int n)
    {
         int s=0;
         for(int i=1;i<=n;i++)
         {
            if(n%i==0)
            {
                s=s+i;
            }
         }
    return s;    
    }
}

public class practical_21 {
    public static void main(String args[])
    {
        mycalc m=new mycalc();
        System.out.println(m.dsum(6));
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
