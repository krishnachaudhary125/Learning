import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary){
        this.empId = empId;
        this.empName = empName;
        setSalary(salary);
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        }
        else {
            System.out.println("Invalid salary");
            this.salary = 0;
        }
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public double getSalary(){
        return salary;
    }
}
public class EmployeeSalaryEncapAssignTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empId : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name : ");
        String name = sc.nextLine();
        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();
        Employee myObj = new Employee(id, name, salary);

        System.out.println("EmpId : "+myObj.getEmpId());
        System.out.println("EmpName : "+myObj.getEmpName());
        System.out.println("Emp Salary : "+myObj.getSalary());
    }
}
