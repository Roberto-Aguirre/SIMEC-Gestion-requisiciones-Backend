package com.simec.requisiciones.entities.Product;

import java.time.LocalDateTime;

import com.simec.requisiciones.entities.Measures.Measures;
import com.simec.requisiciones.entities.ProductType.ProductType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "object_name")
    private String objectName;
    @Column(name = "description")
    private String description;
    @Column(name = "code")
    private String code;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;
    
    @ManyToOne(targetEntity = ProductType.class)
    @JoinColumn(name = "product_type_id")
    private ProductType productType;
    @ManyToOne(targetEntity = Measures.class)
    @JoinColumn(name = "measures_id")
    private Measures measures;

}
