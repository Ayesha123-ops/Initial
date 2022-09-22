import java.util.Scanner;
public class Ternary {
    public static void main(String[]args)
    {
        Scanner ch= new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
               char Vowels = ch.next().charAt(0);
               int select= 1;
               switch (select) {
                   case 1:
                   String a = (Vowels == 'a') ? "This is a vowel" : "Consonant";
                       System.out.println(a);
                   case 2:
                   String b = (Vowels == 'e') ? "This is a vowel" : "Consonant";
                       System.out.println(b);
                   case 3:
                  String c =(Vowels=='i')?"This is a vowel":"Consonant";
                       System.out.println(c);
                   case 4:
                   String d =(Vowels=='o')?"This is a vowel":"Consonant";
                       System.out.println(d);
                   case 5:
                   String e =(Vowels=='u')?"This is a vowel":"Consonant";
                    System.out.println(e);
               } }
}

