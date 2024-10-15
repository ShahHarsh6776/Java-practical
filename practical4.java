import java.util.Scanner;

class practical4
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("::::::::MENU:::::::::");
        System.out.println("Selcet a product from below : ");
        System.out.println(" 1: Motor\n 2: Fan\n 3: Tube\n 4: Wire\n 5: Other\n");
        System.out.println("The price for product(without tax) :\n Motor: Rs.1000\n Fan: Rs.500\n Tube: Rs.100\n Wire: Rs.50\n Others: Rs.300\n");
        System.out.println("The tax on the product:\n Motor: 8%\n Fan: 12%\n Tube: 5%\n Wire: 7.5%\n Others: 3%\n");

        String[] product_name = {"Motor","Fan","Tube","Wire","Other"};
        int[] product_rate = {1000,500,100,50,300};
        int choice;
        char choice1;
        int qty_m = 0,qty_f = 0,qty_t = 0,qty_w = 0,qty_o = 0; 
        double price = 0;

        do
        {
            System.out.println("Enter Product Code for the Product to be purchased");
            choice = s.nextInt();
            switch(choice)
            {
                case 1:
                    price = price + product_rate[0];
                    qty_m = qty_m + 1;
                    break;

                case 2:
                    price = price + product_rate[1];
                    qty_f = qty_f + 1;
                    break;

                case 3:
                    price = price + product_rate[2];
                    qty_t = qty_t + 1;
                    break;

                case 4:
                    price = price + product_rate[3];
                    qty_w = qty_w + 1;
                    break;

                default:
                    price = price + product_rate[4];
                    qty_o = qty_o + 1;

                    break;
            }
            System.out.println(" ");
        	System.out.println(" 23DIT068 HARSH UMESH SHAH \n");
            System.out.println("Want to purchase more product?(Y for Yes and N for No)");
            choice1 = s.next().charAt(0);
        }while(choice1 == 'Y');

        System.out.println("\n------------------------------------------------------------------------------\n");

        if(qty_m>0)
        {
            System.out.println("Qty for motor"+qty_m);
        }

        if(qty_f>0)
        {
            System.out.println("Qty for fan"+qty_f);
        }

        if(qty_t>0)
        {
            System.out.println("Qty for tube"+qty_t);
        }

        if(qty_w>0)
        {
            System.out.println("Qty for wire"+qty_w);
        }

        if(qty_o>0)
        {
            System.out.println("Qty for other"+qty_o);
        }

        System.out.println("Price:"+price);

        



        
    }

}