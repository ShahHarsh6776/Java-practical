import java.util.*;
class rectangle
{
    int l,b;
    rectangle(int l,int b)
     {
         this.l=l;
         this.b=b;
     }
    void parea()
    {
        int a=l*b;
        System.out.println("Area of rectangle is "+a);
    }
    void pperi()
    {
        int p=2 * (l+b);
        System.out.println("Perimeter of rectangle is "+p);
    }
}
class square extends rectangle
{

    int side;

       square(int side,int l,int b)
       {
            super(l,b);
            this.side=side;
       }

       void psarea()
       {
           int a=side*side;
           System.out.println("Area of rectangle is "+a);
   
       }
       void psperi()
       {
           int p=4*side;
           System.out.println("Perimeter of rectangle is "+p);
   
       }
}

public class practical_18
{
    public static void main(String args[])
    {
        int side,l,b;
        Scanner sc=new Scanner(System.in);
           square m[]=new square[3];
           m[0]=new square(1,5,7);
           m[1]=new square(1,8,7);
           m[2]=new square(1,5,10);
           for(int i=0;i<3;i++)
           {
                System.out.println("----------------------");
             m[i].parea();
             m[i].pperi();
            m[i].psarea();
             m[i].psperi();
             System.out.println("----------------------");
             System.out.println();
           }
           System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}