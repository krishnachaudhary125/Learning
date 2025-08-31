import java.util.Scanner;

class Vehicle{
    private String brand;
    private int year;
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
}
class Car extends Vehicle{
    String model;
    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }
    public void display(){
        System.out.println("Brand : "+getBrand());
        System.out.println("Year : "+getYear());
        System.out.println("Model : "+model);
        System.out.println("-------------------------");
    }
}
public class BasicInheritanceAssignOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand name : ");
        String brand = sc.nextLine();
        System.out.print("Enter build year : ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter car model : ");
        String model = sc.nextLine();
        Car car = new Car(brand, year, model);
        System.out.println("-------------------------");
        car.display();
    }
}
