import java.util.InputMismatchException;
import java.util.Scanner;

// Account class
class Account {
    int accountNumber;
    String customerName;
    double balance;
    String accountType;

    public Account(int accountNumber, String customerName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }
}

// Interface for interest-bearing accounts
interface InterestBearing {
    double calculateInterest();
}

// SavingsAccount class
class SavingsAccount extends Account implements InterestBearing {
    double interestRate;
    double minimumBalance;

    public SavingsAccount(int accountNumber, String customerName, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, customerName, balance, "Savings");
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double calculateInterest() {
        if (balance >= minimumBalance) {
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest added. New balance: " + balance);
            return interest;
        } else {
            System.out.println("Balance is below the minimum requirement for interest calculation.");
            return 0;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance to maintain minimum balance.");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: " + minimumBalance);
    }
}

// CheckingAccount class
class CheckingAccount extends Account {
    double minimumBalance;
    double fee;

    public CheckingAccount(int accountNumber, String customerName, double balance, double minimumBalance, double fee) {
        super(accountNumber, customerName, balance, "Checking");
        this.minimumBalance = minimumBalance;
        this.fee = fee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
            if (balance < minimumBalance) {
                balance -= fee;
                System.out.println("Fee charged due to balance falling below the minimum. New balance: " + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Fee: " + fee);
    }
}

// BankApp class
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("\nBank Application Menu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Account Details");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int savAccNumber = 0;
                    try {
                        savAccNumber = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid account number.");
                        scanner.next();
                        continue;
                    }
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer name: ");
                    String savCustName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double savBalance = 0;
                    try {
                        savBalance = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next();
                        continue;
                    }
                    System.out.print("Enter interest rate: ");
                    double interestRate = 0;
                    try {
                        interestRate = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid interest rate.");
                        scanner.next();
                        continue;
                    }
                    System.out.print("Enter minimum balance: ");
                    double savMinBalance = 0;
                    try {
                        savMinBalance = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next();
                        continue;
                    }
                    account = new SavingsAccount(savAccNumber, savCustName, savBalance, interestRate, savMinBalance);
                    System.out.println("Savings account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int chkAccNumber = 0;
                    try {
                        chkAccNumber = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid account number.");
                        scanner.next();
                        continue;
                    }
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer name: ");
                    String chkCustName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double chkBalance = 0;
                    try {
                        chkBalance = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next();
                        continue;
                    }
                    System.out.print("Enter minimum balance: ");
                    double chkMinBalance = 0;
                    try {
                        chkMinBalance = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next();
                        continue;
                    }
                    System.out.print("Enter fee: ");
                    double fee = 0;
                    try {
                        fee = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid fee.");
                        scanner.next();
                        continue;
                    }
                    account = new CheckingAccount(chkAccNumber, chkCustName, chkBalance, chkMinBalance, fee);
                    System.out.println("Checking account created successfully.");
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = 0;
                        try {
                            depositAmount = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next();
                            continue;
                        }
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account exists. Create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = 0;
                        try {
                            withdrawAmount = scanner.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next();
                            continue;
                        }
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account exists. Create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("No account exists. Create an account first.");
                    }
                    break;
                case 6:
                    if (account != null) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("No account exists. Create an account first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
