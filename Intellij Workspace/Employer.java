import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;
import java.util.stream.*;
public interface Employer {
    public static void details(){

    }
    public class Employ implements Employer {
        public void details(){
            //employee ids
            LinkedList<Integer> lista = new LinkedList<Integer>();
            lista.add(1);
            lista.add(4);
            lista.add(3);
            lista.add(4);
            lista.add(6);
            lista.add(8);
            lista.add(4);
            lista.add(9);
            lista.add(4);

            System.out.println(lista);
           lista.forEach(
                   (n)-> System.out.println(n)
           );




        }

        public static void main(String[] args) {
            Employ e= new Employ();
            e.details();
            LinkedList<Integer> listb = new LinkedList<Integer>();
            listb.stream().getClass();

            if (listb.equals(2)){
            System.out.println("Error");

            }
            else{
                System.out.println(listb);
            }






        }

    }
}
