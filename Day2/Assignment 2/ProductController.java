package controller;

import service.ProductService;
import entity.Product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service = new ProductService();

    // POST - Add Product
    @PostMapping
    public Object addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    // GET - Get All Products
    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // PUT - Update Quantity
    @PutMapping("/{id}")
    public String updateQuantity(@PathVariable Long id, @RequestParam int quantity) {
        return service.updateQuantity(id, quantity);
    }

    // DELETE - Delete Product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return service.deleteProduct(id);
    }
}
