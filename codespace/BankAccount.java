public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    // Constructor 1
    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    // Constructor 2 (Overloaded)
    public BankAccount(String accountNumber, String accountHolderName,
                       String accountType, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialDeposit;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Account 1 using Constructor 1
        BankAccount acc1 = new BankAccount("1001", "Sai nandini", "SAVINGS");

        // Account 2 using Constructor 2
        BankAccount acc2 = new BankAccount("1002", "Spoorthi", "CURRENT", 500);

        // Transactions
        acc1.deposit(1000);
        acc1.withdraw(600);

        acc2.deposit(500);
        acc2.withdraw(650);

        // Display account information
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}