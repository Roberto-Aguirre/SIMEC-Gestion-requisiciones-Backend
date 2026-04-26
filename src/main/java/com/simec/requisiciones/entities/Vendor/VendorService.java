package com.simec.requisiciones.entities.Vendor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    
    @Autowired
    private VendorRepository vendorRepository;
    
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
    
    public Optional<Vendor> getVendorById(Long id) {
        return vendorRepository.findById(id);
    }
    
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
    
    public Vendor updateVendor(Long id, Vendor vendor) {
        if (vendorRepository.existsById(id)) {
            return vendorRepository.save(vendor);
        }
        return null;
    }
    
    public boolean deleteVendor(Long id) {
        if (vendorRepository.existsById(id)) {
            vendorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
