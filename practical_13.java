import java.util.*;

class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
 
    public void displayDate() {
        System.out.printf("%d/%d/%d\n", day, month,year);
}
}

public class practical_13 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int day,month,year;
        System.out.println("Enter the day , month ,and year : ");
        day=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        Date d = new Date(day,month,year);
        d.setDay(day);
        d.setMonth(month);
        d.setYear(year);
        d.setDay(day);
        d.setMonth(month);
        d.setYear(year);
        d.displayDate();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
