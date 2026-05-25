import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 80000, true, 10),
                new Product(2, "Phone", 50000, false, 5),
                new Product(3, "Tablet", 30000, true, 15),
                new Product(4, null, 20000, true, 20),
                new Product(5, "Headphones", 5000, true, 25)
        );

        // 1. Remove out-of-stock
        List<Product> inStockProducts = products.stream()
                .filter(Product::isInStock)
                .collect(Collectors.toList());

        // 2. Apply discount (print final price)
        System.out.println("Products after discount:");
        inStockProducts.forEach(p ->
                System.out.println(p.getName() + " -> " + p.getFinalPrice())
        );

        // 3. Total cart amount
        double totalAmount = inStockProducts.stream()
                .mapToDouble(Product::getFinalPrice)
                .sum();
        System.out.println("\nTotal Cart Amount: " + totalAmount);

        // 4. Most expensive product
        Product maxProduct = inStockProducts.stream()
                .max(Comparator.comparing(Product::getFinalPrice))
                .orElse(null);
        System.out.println("\nMost Expensive Product: " + maxProduct);

        // 5. Sort by price
        System.out.println("\nSorted Products:");
        inStockProducts.stream()
                .sorted(Comparator.comparing(Product::getFinalPrice))
                .forEach(System.out::println);

        // 6. Display final price
        System.out.println("\nFinal Product List:");
        inStockProducts.forEach(System.out::println);

        // 7. Handle null using Optional (already handled in getName())
    }
}
