import java.util.*;

class practical_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e1 = new employee();
        employee e2 = new employee();
        
        String fname1, fname2;
        String lname1, lname2;
        Double salary1, salary2;

        System.out.println("Enter first employee first name : ");
        fname1 = sc.nextLine();
        System.out.println("Enter first employee last name : ");
        lname1 = sc.nextLine();
        System.out.println("Enter first employee salary : ");
        salary1 = sc.nextDouble();
        sc.nextLine();

        e1.setname(fname1, lname1);
        e1.setsalary(salary1);
        e1.raise();

        System.out.println("Raise of salary for the first employee has been applied.");

        System.out.println("Enter second employee first name : ");
        fname2 = sc.nextLine();
        System.out.println("Enter second employee last name : ");
        lname2 = sc.nextLine();
        System.out.println("Enter second employee salary : ");
        salary2 = sc.nextDouble();

        e2.setname(fname2, lname2);
        e2.setsalary(salary2);
        e2.raise();

        System.out.println("Raise of salary for the second employee has been applied.");

        System.out.println("\nFirst Employee Details:");
        System.out.println("First name: " + e1.getfname());
        System.out.println("Last name: " + e1.getlname());
        System.out.println("Salary: " + e1.getsalary());

        System.out.println("\nSecond Employee Details:");
        System.out.println("First name: " + e2.getfname());
        System.out.println("Last name: " + e2.getlname());
        System.out.println("Salary: " + e2.getsalary());

        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}

class employee {
    private String fname;
    private String lname;
    private Double salary;

    public employee() {
        salary = 0.0;
    }

    public void setname(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public void setsalary(Double salary) {
        this.salary = salary;
    }

    public String getfname() {
        return fname;
    }

    public String getlname() {
        return lname;
    }

    public Double getsalary() {
        return salary;
    }

    public void raise() {
        this.salary = this.salary + (this.salary * 0.1);
    }
}
