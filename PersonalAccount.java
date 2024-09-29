import java.util.ArrayList;
import java.util.List;

/**
 * Represents a personal bank account.
 */
public class PersonalAccount {
    private int accountNumber; // Unique identifier for the account
    private String accountHolder; // Name of the account holder
    private double balance; // Current balance in the account
    private List<Amount> transactions; // List of transactions associated with the account

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder
 = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double
            amount) {
        // Add a deposit transaction to the list and update the balance
        transactions.add(new Amount(amount, TransactionType.DEPOSIT));
        balance += amount;
    }

    public void withdraw(double amount) {
        // Check if there are sufficient funds
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        // Add a withdrawal transaction to the list and update the balance
        transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
        balance -= amount;
    }

    public void printTransactionHistory() {
        // Print the transaction history in a formatted manner
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getType() + " " + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder()
    {
        return accountHolder;

    }
}
