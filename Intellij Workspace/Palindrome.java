import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string:");
String str=sc.next();
String original= str;int length= str.length(); String reverse="";
for(int i=length-1;i>=0;i--){
reverse= reverse+str.charAt(i);

}
if(original.equals(reverse)){
    System.out.println("This is Palindrome");
    System.out.println(original);
}
else{
    System.out.println("This is'nt Palindrome");
}
    }
}