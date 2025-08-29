import java.util.Scanner;

class Student{
    private String name;
    private int roll;
    private String grade;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
}
public class StudentInfoEncapAssignOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student myObj = new Student();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll no. : ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade : ");
        String grade = sc.nextLine();
        myObj.setName(name);
        myObj.setRoll(roll);
        myObj.setGrade(grade);
        System.out.println(myObj.getName());
        System.out.println(myObj.getRoll());
        System.out.println(myObj.getGrade());
    }
}
