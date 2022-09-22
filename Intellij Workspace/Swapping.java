import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        int Age_of_girl;
        int Age_of_boy;
        System.out.println("Enter the age:");
        Scanner in= new Scanner(System.in);
          Age_of_girl= in.nextInt();
          Age_of_boy= in.nextInt();
        System.out.println("Age of girl Before Swapping : "+ Age_of_girl);
        System.out.println("Age of boy Before Swapping: " +Age_of_boy);
        Age_of_girl= Age_of_girl+Age_of_boy; //adding age of both
        Age_of_boy= Age_of_girl-Age_of_boy; //subtracting age of boy from total will return to opposite value
        Age_of_girl= Age_of_girl-Age_of_boy;// subtracting age of girl from total will swap it
        System.out.println("Age of th girl After Swapping:"+Age_of_girl);
        System.out.println("Age of boy After Swapping: "+Age_of_boy);
    }
}
