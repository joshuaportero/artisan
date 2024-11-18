package dev.portero.artisan.domain.product;

import jakarta.persistence.*;
import lombok.*;
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

