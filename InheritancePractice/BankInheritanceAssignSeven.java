package InheritancePractice;
import java.util.Scanner;

class Account {
    private int accountNumber;
    protected double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("-------------------------------------------------------------");
            System.out.println(amount + " deposited successfully. New balance is " + balance);
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Amount should be greater than zero.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Account number : " + getAccountNumber());
        System.out.println("Balance : " + getBalance());
    }
}

class SavingAccount extends Account {
    private double interestRate = 7.5;

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        double newBalance = getBalance() + ((getBalance() * interestRate) / 100);
        setBalance(newBalance);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Interest added at rate " + interestRate + "%. New balance is " + getBalance());
    }
}

class CurrentAccount extends Account {
    private double overdraft = 500;

    public double getOverdraft() {
        return overdraft;
    }

    public void withdraw(double amount) {
        if (amount > (getBalance() + overdraft)) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Overdraft limit exceeded.");
        } else {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("-------------------------------------------------------------");
            System.out.println(amount + " withdrawn successfully. Remaining balance is " + getBalance());
        }
    }
}

public class BankInheritanceAssignSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose account type
        System.out.println("-------------------------------------------------------------");
        System.out.println("Choose account type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int accType = sc.nextInt();

        Account account;
        if (accType == 1) {
            account = new SavingAccount();
        } else {
            account = new CurrentAccount();
        }

        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextInt());

        int choice;
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Display details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Add Interest (Saving only)");
            System.out.println("5. Show Overdraft Limit (Current only)");
            System.out.println("6. Exit");
            System.out.print("Enter number: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.display();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    if (account instanceof CurrentAccount ca) {
                        System.out.print("Enter amount to withdraw: ");
                        ca.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Withdraw with overdraft is only available for Current Account.");
                    }
                    break;
                case 4:
                    if (account instanceof SavingAccount sa) {
                        sa.addInterest();
                    } else {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Interest is only available for Saving Account.");
                    }
                    break;
                case 5:
                    if (account instanceof CurrentAccount ca) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Overdraft Limit: " + ca.getOverdraft());
                    } else {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("No overdraft for Saving Account.");
                    }
                    break;
                case 6:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Thank you for using this program.");
                    break;
                default:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 6);

        sc.close();
    }
}
