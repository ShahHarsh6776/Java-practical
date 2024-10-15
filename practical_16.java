class practical_16
{
    public static void main(String[] args)
    {
        parentclass p = new parentclass();
        baseclass b = new baseclass();
        System.out.println("Calling parent class by object of parent class: ");
        p.parent();
        System.out.println("Calling child class by object of child class : ");
        b.base();
        System.out.println("Calling parent class by object of child class : ");
        b.parent();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
class parentclass
{
    void parent()
    {
        System.out.println("Parent class");
    }
}
class baseclass extends parentclass
{
    void base()
    {
        System.out.println("Child class");
    }
}