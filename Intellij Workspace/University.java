import javax.naming.Name;
import java.util.Scanner;
public abstract class University {
    private String Name;
    private String Email;
    private String Address;


    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String Name){
        this.Name=Name;


    }

    public void setEmail(String Email) {
        this.Email=Email;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }
    public abstract void PrintInfo(String Name, String Email, String Address);

    static class Department extends University {



        String dept_address;
        String dept_name;
        String dept_email;
        int fee_structure;
        Department(String dept_address, String dept_name, String dept_email, int fee_structure){
            super();
            this.dept_address=dept_address;
            this.dept_email=dept_email;
            this.dept_name=dept_name;
            this.fee_structure=fee_structure;
        }

        public String getDept_address() {
            return dept_address;
        }

        public void setDept_address(String dept_address) {
            this.dept_address = dept_address;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getDept_email() {
            return dept_email;
        }

        public void setDept_email(String dept_email) {
            this.dept_email = dept_email;
        }

        public int getFee_structure() {
            return fee_structure;
        }

        public void setFee_structure(int fee_structure) {
            this.fee_structure = fee_structure;
        }


        public void PrintInfo() {
            System.out.println(dept_address);
            System.out.println(dept_email);
            System.out.println(dept_name);
            System.out.println(fee_structure);



        }


        @Override
        public void PrintInfo(String Name, String Email, String Address) {

        }
    }

}
class Main{
    public static void main(String[] args) {
       University.Department dep= new University.Department("Islamabad","CS","@021",70000);
        System.out.println();
    }

}
