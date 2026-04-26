package com.simec.requisiciones.entities.DetailPurchaseRequisition;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailPurchaseRequisitionService {
    
    @Autowired
    private DetailPurchaseRequisitionRepository detailPurchaseRequisitionRepository;
    
    public List<DetailPurchaseRequisition> getAllDetailPurchaseRequisitions() {
        return detailPurchaseRequisitionRepository.findAll();
    }
    
    public Optional<DetailPurchaseRequisition> getDetailPurchaseRequisitionById(Long id) {
        return detailPurchaseRequisitionRepository.findById(id);
    }
    
    public DetailPurchaseRequisition saveDetailPurchaseRequisition(DetailPurchaseRequisition detailPurchaseRequisition) {
        return detailPurchaseRequisitionRepository.save(detailPurchaseRequisition);
    }
    
    public DetailPurchaseRequisition updateDetailPurchaseRequisition(Long id, DetailPurchaseRequisition detailPurchaseRequisition) {
        if (detailPurchaseRequisitionRepository.existsById(id)) {
            return detailPurchaseRequisitionRepository.save(detailPurchaseRequisition);
        }
        return null;
    }
    
    public boolean deleteDetailPurchaseRequisition(Long id) {
        if (detailPurchaseRequisitionRepository.existsById(id)) {
            detailPurchaseRequisitionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
