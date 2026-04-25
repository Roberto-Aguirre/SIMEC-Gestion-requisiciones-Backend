package com.simec.requisiciones.entities.Measures;

import java.time.LocalDateTime;
import java.util.List;

import com.simec.requisiciones.entities.Product.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "measures")
public class Measures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "measure_unit")
    private String measureUnit;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;

    // @OneToMany(targetEntity = Product.class)
    // @JoinColumn(name = "measures_id")
    // private List<Product> products;
}
