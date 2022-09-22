import java.util.ArrayList;
    public class Custom{
        int n = 5;
        public class Employee {
            int eno;
            String name;
            Employee(int eno, String name) {
                this.eno = eno;
                this.name = name;
            }
        }
        public static void main(String args[]) {
            int eno[] = {101, 102, 103, 104, 105};
            String name[] = {"Jane", "Mary", "Adam", "Harry", "John"};
            Custom caList = new Custom();
            caList.add(eno, name);
        }
        public void add(int eno[], String name[]) {
            ArrayList<Employee> aList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                aList.add(new Employee(eno[i], name[i]));
            }
            print(aList);
        }
        public void print(ArrayList<Employee> aList) {
                for (int i = 0; i < n; i++) {
                    Employee e = aList.get(i);
                    System.out.println("\nEmployee Number: " + e.eno);
                    System.out.println("Employee Name: " + e.name);
                }
            }
        }