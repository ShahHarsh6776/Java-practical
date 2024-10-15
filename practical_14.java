import java.util.Scanner;
class practical_14
{
    public static void main(String[] args)
    {
        Double length,breadth,garea;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a rectangle : ");
        length = sc.nextDouble();
        System.out.println("Enter breadth of a rectangle : ");
        breadth = sc.nextDouble();
        area a1 = new area(length,breadth);
        garea = a1.returnarea();
        System.out.println("Area of a rectangle : "+garea);
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
class area
{
    private Double length,breadth;
    public area(Double length,Double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public Double returnarea()
    {
        Double area = length*breadth;
        return area;
    }
}