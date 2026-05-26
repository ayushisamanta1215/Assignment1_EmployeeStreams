import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, "ACC101", "DEBIT", 60000, LocalDate.now().minusDays(2)),
                new Transaction(2, "ACC102", "CREDIT", 40000, LocalDate.now().minusDays(5)),
                new Transaction(3, "ACC103", "CREDIT", 70000, LocalDate.now().minusDays(1)),
                new Transaction(4, "ACC104", "DEBIT", 20000, LocalDate.now().minusDays(10)),
                new Transaction(5, "ACC105", "CREDIT", 90000, LocalDate.now())
        );

        // 1. All debit transactions
        System.out.println("Debit Transactions:");
        transactions.stream()
                .filter(t -> t.getTransactionType().equalsIgnoreCase("DEBIT"))
                .forEach(System.out::println);

        // 2. Transactions above 50,000
        System.out.println("\nTransactions > 50000:");
        transactions.stream()
                .filter(t -> t.getAmount() > 50000)
                .forEach(System.out::println);

        // 3. Total credited amount
        double totalCredit = transactions.stream()
                .filter(t -> t.getTransactionType().equalsIgnoreCase("CREDIT"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("\nTotal Credited Amount: " + totalCredit);

        // 4. Group by transaction type
        System.out.println("\nGrouped Transactions:");
        Map<String, List<Transaction>> grouped = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getTransactionType));

        grouped.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });

        // 5. Latest transaction
        Transaction latest = transactions.stream()
                .max(Comparator.comparing(Transaction::getTransactionDate))
                .orElse(null);
        System.out.println("\nLatest Transaction: " + latest);

        // 6. Sort by amount descending
        System.out.println("\nSorted by Amount Desc:");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .forEach(System.out::println);

        // 7. Parallel Stream processing
        System.out.println("\nParallel Processing:");
        transactions.parallelStream()
                .forEach(t -> System.out.println(t));
    }
}
