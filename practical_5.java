import java.util.*;
class practical_5
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        char c = 3;
        char chance = 5;
        int i,num,n;
        Scanner sc = new Scanner(System.in);
        int rand_1 = rand.nextInt(100);
        System.out.println("::::::COMPUTER HAS CHOOSEN A RANDOM NUMBER::::::::");
        System.out.println("Try guessing a number between 1 to 100. You have 5 chances");
        System.out.println("Start guessing.....");
        do
        {
            System.out.println("Your chance is : ");
            for(i=0;i<chance;i++)
            {
                System.out.print(c);
            }
            System.out.println(" ");
            System.out.println("Choose a number......");
            num = sc.nextInt();
            n=num-rand_1;
            n=Math.abs(n);
            if(n<=30)
            {
                System.out.println("You are close...");
            }
            else if(n>30 && n<60)
            {
                System.out.println("You are in medium range...");
            }
            else if(n>=60)
            {
                System.out.println("You are too high...");
            }
            else
            {
                System.out.println("You have choosen a perfect number.....");
                System.out.println("System selected number was "+rand_1);
                break;
            }
            if(chance==1)
            {
                System.out.println("Sorry you have losen a game");
                System.out.println("System selected number was "+rand_1);
                System.out.println("\n 23DIT068     HARSH UMESHKUMAR SHAH");
            }
            chance--;
        }while(chance>0);
    }
}