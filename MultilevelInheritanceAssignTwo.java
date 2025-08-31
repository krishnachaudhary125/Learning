import java.util.Scanner;
class Person{
    String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class Employees extends Person{
    private double salary;
    public Employees(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employees{
    String department;
    public Manager(String name, int age, double salary, String department){
        super(name, age, salary);
        this.department = department;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+getAge());
        System.out.println("Salary : "+getSalary());
        System.out.println("Department : "+department);
        System.out.println("---------------------------------");
    }
}

public class MultilevelInheritanceAssignTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter department : ");
        String department = sc.nextLine();
        Manager manager = new Manager(name, age, salary, department);
        System.out.println("---------------------------------");
        manager.display();
        sc.close();
    }
}
