package com.simec.requisiciones.entities.PurchaseRequisition;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseRequisitionService {
    
    @Autowired
    private PurchaseRequisitionRepository purchaseRequisitionRepository;
    
    public List<PurchaseRequisition> getAllPurchaseRequisitions() {
        return purchaseRequisitionRepository.findAll();
    }
    
    public Optional<PurchaseRequisition> getPurchaseRequisitionById(Long id) {
        return purchaseRequisitionRepository.findById(id);
    }
    
    public PurchaseRequisition savePurchaseRequisition(PurchaseRequisition purchaseRequisition) {
        return purchaseRequisitionRepository.save(purchaseRequisition);
    }
    
    public PurchaseRequisition updatePurchaseRequisition(Long id, PurchaseRequisition purchaseRequisition) {
        if (purchaseRequisitionRepository.existsById(id)) {
            return purchaseRequisitionRepository.save(purchaseRequisition);
        }
        return null;
    }
    
    public boolean deletePurchaseRequisition(Long id) {
        if (purchaseRequisitionRepository.existsById(id)) {
            purchaseRequisitionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
