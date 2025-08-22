import java.util.Scanner;

class Bank{
    private double balance;
    public void Deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(amount+" is deposited successfully and new balance is "+balance+".");
        }
        else{
            System.out.println("Amount should be greater than zero.");
        }
    }
    public void Withdraw(double amount){
        if(amount<=balance && amount>0){
            balance -= amount;
            System.out.println(amount+" has been withdrawn and your remaining balance is "+ balance+".");
        }else{
            System.out.println("Invalid input.");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class EncapLearn {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        do{
            System.out.println("-------------------------------------------");
            System.out.println("Enter 1 to check balance.");
            System.out.println("Enter 2 to deposit balance.");
            System.out.println("Enter 3 to Withdraw balance.");
            System.out.println("Enter 4 to exit.");
            System.out.print("Enter : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Current balance : "+obj.getBalance());
                break;
                case 2:
                    System.out.print("Enter amount to be deposited : ");
                    double dep = sc.nextDouble();
                    obj.Deposit(dep);
                break;
                case 3:
                    System.out.print("Enter amount to be withdrawn : ");
                    double wit = sc.nextDouble();
                    obj.Withdraw(wit);
                break;
                case 4:
                    System.out.println("ThankYou for using.");
                break;
                default:
                    System.out.println("Invalid input.");
            }
        }while(choice != 4);
    }
}
