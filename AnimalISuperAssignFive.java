class Animal{
    public void sound(){
        System.out.println("Animal makes sound.");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog bark.");
    }
}
public class AnimalISuperAssignFive {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.sound();
    }
}
