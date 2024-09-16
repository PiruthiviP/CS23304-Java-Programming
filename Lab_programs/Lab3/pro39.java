//Create a class for bank account that has name of the depositor, type of account, account number, and balance amount. The class should have methods that assigns initial values, to deposit an amount, to withdraw amount after checking balance and to display the name and
//balance. (Use Constructors also)



public class pro39 {
    private String depositorName;
    private String accountType;
    private int accountNumber;
    private double balance;

    public pro39(String depositorName, String accountType, int accountNumber, double balance) {
        this.depositorName = depositorName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New balance is " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        pro39 account = new pro39("John Doe", "Savings", 123456, 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountDetails();
    }
}