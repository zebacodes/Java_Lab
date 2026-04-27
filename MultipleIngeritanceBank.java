import java.util.Scanner;

// Bank Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Customer class
class Customer {
    String name;
    int accNo;

    void getCustomerData(Scanner sc) {
        System.out.print("Enter Customer Name: ");
        name = sc.next();

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
    }

    void displayCustomer() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
    }
}

// Account class implementing Bank
class Account extends Customer implements Bank {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {
        displayCustomer();
        System.out.println("Balance: " + balance);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        int choice;

        a.getCustomerData(sc);

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    a.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    a.withdraw(w);
                    break;

                case 3:
                    a.displayAccount();
                    break;
            }

        } while(choice != 4);
    }
}
