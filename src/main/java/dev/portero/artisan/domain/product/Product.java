package dev.portero.artisan.domain.product;

import dev.portero.artisan.domain.product.types.ProductStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private BigDecimal price;
    private int stockQuantity;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt; // TODO: Use auditing instead.

    @LastModifiedDate
    private LocalDateTime updatedAt; // TODO: Use auditing instead.

    @Enumerated(EnumType.STRING)
    private ProductStatus status;
}

