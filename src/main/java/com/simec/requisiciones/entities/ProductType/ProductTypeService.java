package com.simec.requisiciones.entities.ProductType;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    
    @Autowired
    private ProductTypeRepository productTypeRepository;
    
    public List<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }
    
    public Optional<ProductType> getProductTypeById(Long id) {
        return productTypeRepository.findById(id);
    }
    
    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }
    
    public ProductType updateProductType(Long id, ProductType productType) {
        if (productTypeRepository.existsById(id)) {
            return productTypeRepository.save(productType);
        }
        return null;
    }
    
    public boolean deleteProductType(Long id) {
        if (productTypeRepository.existsById(id)) {
            productTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
