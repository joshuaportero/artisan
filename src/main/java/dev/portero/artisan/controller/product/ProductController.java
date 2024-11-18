package dev.portero.artisan.controller.product;

import dev.portero.artisan.controller.product.dto.CreateProductRequest;
import dev.portero.artisan.domain.product.Product;
import dev.portero.artisan.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody CreateProductRequest product) {
        return service.createProduct(product);
    }

    @GetMapping
    public ResponseEntity<?> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getProduct(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody CreateProductRequest product) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        return service.deleteProduct(id);
    }
}
