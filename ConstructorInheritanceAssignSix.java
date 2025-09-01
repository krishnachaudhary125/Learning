class Persons{
    String name;
    private int age;
    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class Students extends Persons{
    int roll;
    public Students(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+getAge());
        System.out.println("Roll : "+roll);
    }
}
public class ConstructorInheritanceAssignSix {
    public static void main(String[] args) {
        Students students = new Students("Krishna", 21, 5);
        students.display();
    }
}
