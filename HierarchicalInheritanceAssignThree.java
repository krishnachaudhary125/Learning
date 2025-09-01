import java.util.Scanner;
class Shape{
    public void area(){};
}
class Circle extends Shape{
    final double pi = 3.14;
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle = "+(pi*radius*radius));
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle = "+(length*breadth));
    }
}
public class HierarchicalInheritanceAssignThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        circle.area();
        rectangle.area();
        sc.close();
    }
}
