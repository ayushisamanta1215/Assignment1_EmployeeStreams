package service;

import entity.Product;
import java.util.*;

public class ProductService {

    private Map<Long, Product> database = new HashMap<>();
    private Long idCounter = 1L;

    // Add Product
    public Object addProduct(Product product) {

        // Validation
        if (product.getPrice() < 0) {
            return "Invalid Price";
        }

        if (product.getQuantity() < 0) {
            return "Invalid Quantity";
        }

        product.setId(idCounter);
        database.put(idCounter, product);
        idCounter++;

        return product;
    }

    // Get All Products
    public List<Product> getProducts() {
        return new ArrayList<>(database.values());
    }

    // Update Product Quantity
    public String updateQuantity(Long id, int quantity) {

        if (quantity < 0) {
            return "Invalid Quantity";
        }

        if (database.containsKey(id)) {
            Product product = database.get(id);
            product.setQuantity(quantity);
            return "Quantity updated successfully";
        }

        return "Product not found";
    }

    // Delete Product
    public String deleteProduct(Long id) {

        if (database.remove(id) != null) {
            return "Product deleted successfully";
        }

        return "Product not found";
    }
}
