import java.util.*;
class practical_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("Length is: " + len);
        System.out.println(str.toLowerCase());
        char[] c;
        c = str.toCharArray();
        for (int i = 0; i < len; i++) 
        {
            if (c[i] == 'H') {
                c[i] = 'A';
            }
        }
        str=Arrays.toString(c);
        System.out.println("modified string is : "+str);
        System.out.println("modified string in small case is : "+str.toLowerCase());
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
