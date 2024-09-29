/**
 * Represents a single transaction with an amount and type.
 */
public class Amount {
    private double amount;
    private TransactionType type;

    public Amount(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }
}
