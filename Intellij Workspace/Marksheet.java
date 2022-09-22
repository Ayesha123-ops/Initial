import java.util.Scanner;
public class Marksheet {
    public static void main(String[] args){
        int english,java,urdu,math,sum,roll_no;
        String name;
        double div;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        name= sc.nextLine();
        System.out.println("Enter your roll no: ");
        roll_no= sc.nextInt();
        System.out.println("Enter your english number: ");
        english= sc.nextInt();
        System.out.println("Enter your java number: ");
        java= sc.nextInt();
        System.out.println("Enter your urdu number: ");
        urdu= sc.nextInt();
        System.out.println("Enter your math number: ");
        math= sc.nextInt();
        sum= english+java+urdu+math;
        div=sum/4;
        System.out.println("Name:"+"                                         "+name);
        System.out.println("Roll number:"+"                                 "+roll_no);
        System.out.println(".................................................... ");
        System.out.println("Subject"+"                                      Marks");
        System.out.println(".....................................................");
        System.out.println("English:"+"                                      "+english);
        System.out.println("Java:"+"                                         "+java);
        System.out.println("Urdu:"+"                                         "+urdu);
        System.out.println("Math:"+"                                         "+math);
        System.out.println(".......................................................");
        System.out.println("Sum:"+"                                           "+sum);
        System.out.println("-------------------------------------------------------");
        System.out.println("Percentage:"+"                                    "+div);









    }
}
