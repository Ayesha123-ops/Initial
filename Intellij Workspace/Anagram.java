import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String first="";
        String second="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Strings: " );
        first= sc.nextLine();
        second=sc.nextLine();
        if(first.length()!=second.length()){
            System.out.println("The given Strings are not Anagrams");
            System.out.println("first string="   +first);
            System.out.println("second string="   +second);
        }
        else {
            char[] ch1 = first.toCharArray();
            char[] ch2 = second.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("The given strings are anagram"  +" " + first  + " "      + second);
            } else {
                System.out.println("The strings are not anagram");
            }
        }

    }
















}
