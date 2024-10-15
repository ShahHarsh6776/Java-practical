import java.util.Scanner;

class practical_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1. for employee 2. for manager ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                employee e = new employee();
                e.input();
                e.display();
                e.print();
                break;
            case 2:
                manager m = new manager();
                m.input();
                m.display();
                m.print();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
        sc.close();
    }
}

class member {
    String name;
    int age;
    String phone;
    String address;
    long salary;

    member() {
        this.name = "Harsh Shah";
        this.age = 50;
        this.phone = "6352421886";
        this.address = "101, Sharadnagar, Tarsali, Vadodara";
        this.salary = 1000000;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phone);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
    }
}

class manager extends member {
    String spec;
    String dept;
    Scanner sc = new Scanner(System.in);

    manager() { 
        super();
    }

    void input() {
        System.out.println("Enter specialization: ");
        this.spec = sc.nextLine();
        System.out.println("Enter department: ");
        this.dept = sc.nextLine();
    }

    void print() {
        System.out.println("Specialization: " + spec);
        System.out.println("Department: " + dept);
    }
}

class employee extends member {
    String spec;
    String dept;
    Scanner sc = new Scanner(System.in);

    employee() {
        super();
    }

    void input() {
        System.out.println("Enter specialization: ");
        this.spec = sc.nextLine();
        System.out.println("Enter department: ");
        this.dept = sc.nextLine();
    }

    void print() {
        System.out.println("Specialization: " + spec);
        System.out.println("Department: " + dept);
    }
}
