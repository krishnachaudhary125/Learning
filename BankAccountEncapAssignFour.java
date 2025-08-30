import java.util.Scanner;

class BankAccount{
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println(amount+" deposited successfully.");
        }
        else{
            System.out.println("Depositing amount should be greater than zero.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println(amount+" withdrawn successfully.");
        }
        else{
            System.out.println("Withdrawing amount should be greater than zero or smaller than your current balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void accountDetail(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account holder name : "+accountHolderName);
        System.out.println("Balance : "+balance);
        System.out.println("--------------------------");
    }
}
public class BankAccountEncapAssignFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number : ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name : ");
        String acchold = sc.nextLine();
        BankAccount bank = new BankAccount(accNo, acchold);
        int num;
        do {
            System.out.println("Enter 1 for deposit.");
            System.out.println("Enter 2 for withdraw.");
            System.out.println("Enter 3 for balance.");
            System.out.println("Enter 4 for detail.");
            System.out.println("Enter 5 to exit.");
            System.out.println("--------------------------");
            System.out.print("Enter number : ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Enter depositing amount : ");
                    bank.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawing amount : ");
                    bank.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Current balance : "+bank.getBalance());
                    break;
                case 4:
                    bank.accountDetail();
                    break;
                case 5:
                    System.out.println("Thank you for using our system.");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }while (num != 5) ;
    }
}

