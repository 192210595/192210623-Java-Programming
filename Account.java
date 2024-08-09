// Account class
class Account {
    int accountNumber;
    String customerName;
    double balance;
    String accountType;

    public void deposit(double amount) {
        // Deposit money
    }

    public void withdraw(double amount) {
        // Withdraw money
    }

    public void checkBalance() {
        // Check balance
    }

    public void displayAccountDetails() {
        // Display account details
    }
}

// SavingsAccount class
class SavingsAccount extends Account implements InterestBearing {
    double interestRate;
    double minimumBalance;

    public double calculateInterest() {
        // Calculate interest
    }
}

// CheckingAccount class
class CheckingAccount extends Account {
    double minimumBalance;
    double fee;

    @Override
    public void withdraw(double amount) {
        // Withdraw money with fee if balance falls below minimum
    }
}

// Interface for interest-bearing accounts
interface InterestBearing {
    double calculateInterest();
}

// BankApp class
public class BankApp {
    public static void main(String[] args) {
        // Menu-driven program for banking operations
    }
}
