import java.util.Scanner;
class practical2
{
    public void morseToEnglish(String[] code, String morseCode)
    {
        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode + " to English is: ");

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < code.length; j++) 
            {
                if (array[i].compareTo(code[j]) == 0) 
                {
                    System.out.print((char)(j + 'a') + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void englishToMorse(String[] code,String englishLang,char[] letter)
    {
        
        System.out.print("Morse code of " + englishLang + " is ");
        for (int i = 0; i < englishLang.length(); i++) 
        {
            for (int j = 0; j < letter.length; j++) 
            {
                if (englishLang.charAt(i) == letter[j]) 
                {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0' };
        String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
                          "..-.", "--.",  "....", "..",   ".---",
                          "-.-",  ".-..", "--",   "-.",   "---",
                          ".--.", "--.-", ".-.",  "...",  "-",
                          "..-",  "...-", ".--",  "-..-", "-.--",
                          "--..", "|" };

        System.out.println("Here your choice.\n 1. convert morse code into string.\n 2. convert string into morse code.");
        
        Scanner choice = new Scanner(System.in); 
        System.out.println("Enter your choice:");
        int choice1 = choice.nextInt();
        choice.nextLine(); 
        System.out.println("choice is: " + choice1);  

        switch(choice1)
        {
           case 1:
           {
                System.out.println("Enter your Morse code:");
                String morseCode = choice.nextLine();
                practical_2 obj = new practical_2();
                obj.morseToEnglish(code, morseCode);
				System.out.println(" ");
        		System.out.println(" 23DIT068 HARSH UMESH SHAH ");
                break;
           }
           case 2:
           {
                System.out.println("Enter your string:");
                String englishLang = choice.nextLine();
                practical_2 obj = new practical_2();
                obj.englishToMorse(code, englishLang, letter);
				System.out.println(" ");
        		System.out.println(" 23DIT068 HARSH UMESH SHAH ");
                break;
           }
           default:
           {
              System.out.println("Your choice is invalid.");  
           }
        }
        choice.close();
    }
}