package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.Product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
