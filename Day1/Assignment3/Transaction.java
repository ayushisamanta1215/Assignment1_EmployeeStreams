import java.time.LocalDate;

public class Transaction {
    int transactionId;
    String accountNumber;
    String transactionType;
    double amount;
    LocalDate transactionDate;

    public Transaction(int transactionId, String accountNumber, String transactionType, double amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String toString() {
        return transactionId + " " + accountNumber + " " + transactionType + " " + amount + " " + transactionDate;
    }
}
