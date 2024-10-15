import java.util.Scanner;
import java.util.Arrays;

class practical_9 {
    public static void main(String[] args) {
        String str;
        String s = "";
        char[] ch;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any String:");
        str = obj.nextLine();

        System.out.println("Length of String: " + str.length());
        System.out.println("Lower Case of String: " + str.toLowerCase());
        System.out.println("Upper Case of String: " + str.toUpperCase());

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }
        System.out.println("Reverse of String: " + s);

        ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("Sorting of String: " + Arrays.toString(ch));

		System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
