/**
 * The main entry point for the program.
 */
public class Main {

    public static void main(String[] args) {
        // Create a new PersonalAccount object
        PersonalAccount account = new PersonalAccount(230106010, "Aktan Zhusupbekov");

        // Make some transactions
        account.deposit(4123);
        account.withdraw(800);
        account.deposit(193);

        // Print the account details
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());

        // Print the transaction history
        account.printTransactionHistory();
    }
}
