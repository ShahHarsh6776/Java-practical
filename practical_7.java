import java.util.Scanner;
class practical_7
{
    public static void main(String[] args)
    {
        int[] arr;
        int size,i,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        arr = new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" Element : ");
            arr[i] = sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]==9)
            {
                k++;
            }
        }
        System.out.println("9 is :"+(k)+" Times.");
        System.out.println(" ");
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}