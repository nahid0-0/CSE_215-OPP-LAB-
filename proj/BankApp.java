import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name & ID to access your bank account:");
        String name = s.nextLine();
        String id = s.nextLine();
        BankAcc obj1 = new BankAcc(name, id);
        obj1.runMenu();
    }
}

class BankAcc {
    String name;
    String id;
    Bank b;

    BankAcc(String name, String id) {
        this.name = name;
        this.id = id;
        this.b = new Bank();
    }

    void runMenu() {
        char option = ' ';
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Your ID: " + id);
        System.out.println();

        System.out.println("************");
        System.out.println("Choose an option:");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        System.out.println("************");

        while (option != 'e') {
            System.out.print("Enter your choice: ");
            option = s.next().charAt(0);
            System.out.println();

            if (option == 'a') {
                System.out.println("Balance: " + b.bal);
                System.out.println();
            } else if (option == 'b') {
                System.out.print("Enter amount to deposit: ");
                double amount = s.nextDouble();
                b.deposit(amount);
                System.out.println();
            } else if (option == 'c') {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = s.nextDouble();
                b.withdraw(withdrawAmount);
                System.out.println();
            } else if (option == 'd') {
                System.out.println("Previous Transaction:");
                b.getPrevTrans();
                System.out.println();
            } else if (option == 'e') {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
                System.out.println();
            }
        }

        System.out.println("Thank you for using our banking services!");
    }
}

class Bank {
    double bal;
    double prevTrans;

    void deposit(double amount) {
        if (amount != 0) {
            bal += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0 && bal >= amount) {
            bal -= amount;
            prevTrans = -amount;
        } else if (bal < amount) {
            System.out.println("Insufficient balance");
        }
    }

    void getPrevTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction occurred");
        }
    }
}
