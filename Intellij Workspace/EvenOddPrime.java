import java.util.Scanner;

import java.io.InputStreamReader;

public class EvenOddPrime {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System. in );
            System.out.print("Select even,odd or a prime number");
            int select = 2;
            switch (select)
            {
                case 1:
                    int num;
                    System.out.print("Enter an Integer number: ");
                    //The input provided by user is stored in num
                    Scanner input = new Scanner(System. in );
                    num = input.nextInt();
                    /* If number is divisible by 2 then it's an even number
                     * else odd number*/
                    if (num % 2 == 0) System.out.println("Entered number is even");
                    else System.out.println("Entered number is odd");
                    break;
                case 2:
                    int temp;
                    boolean isPrime = true;
                    Scanner scan = new Scanner(System. in );
                    System.out.print("Enter an integer number: ");
                    //capture the input in an integer
                    int numb = scan.nextInt();
                    //If isPrime is true then the number is prime else not
                    if (isPrime) System.out.println(numb + " is a Prime Number");
                    else System.out.println(numb + " is not a Prime Number");
            }
        }
    }

