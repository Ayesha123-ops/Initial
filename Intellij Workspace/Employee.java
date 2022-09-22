import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class Employee {
    int Emp_id;
    public int getEmp_id(){
    return Emp_id;
    }
    public void setEmp_id(int Emp_id){
        this.Emp_id=Emp_id;
    }
    private String empName;
    private String empDept;
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(){
        this.empName=empName;
    }
    public String getEmpDept(){
        return empDept;
    }
    public void setEmpDept(){
        this.empDept=empDept;
    }
    public Employee(int emp_id,String empName,String empDept){
        this.Emp_id=emp_id;
        this.empName=empName;
        this.empDept=empDept;
    }
} class Employ{
    public static void main(String[] args) {
        Employee employee[]= new Employee[4];
        employee[0]= new Employee(1,"Wasiq","IT");
        employee[1]= new Employee(2,"Ali","Enviremental");
        employee[2]= new Employee(3,"Zunairs","SE");
        employee[3]= new Employee(2,"Fatima","Biotech");
        System.out.println("Employee with Dept= ");
        System.out.println("---------------------");
        for (int i=0;i<employee.length;i++){
            System.out.println("Name:"+ employee[i].getEmpName());
            System.out.println("Dept:"+ employee[i].getEmpDept());
            System.out.println("-----------------");
            Stream<Employee>stream= Arrays.stream(employee);
            List<Employee>newstream=stream.filter(e->(e.getEmp_id()!=2)).collect(Collectors.toList());
            System.out.println("Employee with department: ");
            System.out.println("---------------");
            for(int j=0;j<newstream.size();j++){
                System.out.println("ID"+ newstream.get(j).getEmp_id());
                System.out.println("Name"+ newstream.get(j).getEmpName());
                System.out.println("Dept"+ newstream.get(j).getEmpDept());
                System.out.println("----------------");
            }


}

    } }


