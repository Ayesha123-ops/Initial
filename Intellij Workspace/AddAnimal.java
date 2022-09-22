import java.util.LinkedList;
import java.util.*;
import java.util.stream.*;

public class AddAnimal {
    public static void main(String[] args) {
        LinkedList<String> animal = new LinkedList<String>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Mouse");
        animal.add("Monkey");
        System.out.println(animal);
        animal.forEach(
                (n)->System.out.println(n)

                );
    }
}
