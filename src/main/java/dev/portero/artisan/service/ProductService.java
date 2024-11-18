package dev.portero.artisan.service;

import dev.portero.artisan.controller.product.dto.CreateProductRequest;
import dev.portero.artisan.domain.product.Product;
import dev.portero.artisan.domain.product.ProductStatus;
import dev.portero.artisan.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product createProduct(CreateProductRequest product) {
        return repository.save(Product.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .status(ProductStatus.AVAILABLE)
                .build());
    }

    public Product getProduct(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public ResponseEntity<?> updateProduct(Long id, CreateProductRequest product) {
        return ResponseEntity.ok(repository.save(Product.builder()
                .id(id)
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .status(ProductStatus.AVAILABLE)
                .build()));
    }

    public ResponseEntity<?> deleteProduct(Long id) {
        try {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
