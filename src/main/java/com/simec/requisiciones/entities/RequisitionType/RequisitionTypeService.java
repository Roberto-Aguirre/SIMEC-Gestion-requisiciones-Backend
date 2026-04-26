package com.simec.requisiciones.entities.RequisitionType;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequisitionTypeService {
    
    @Autowired
    private RequisitionTypeRepository requisitionTypeRepository;
    
    public List<RequisitionType> getAllRequisitionTypes() {
        return requisitionTypeRepository.findAll();
    }
    
    public Optional<RequisitionType> getRequisitionTypeById(Long id) {
        return requisitionTypeRepository.findById(id);
    }
    
    public RequisitionType saveRequisitionType(RequisitionType requisitionType) {
        return requisitionTypeRepository.save(requisitionType);
    }
    
    public RequisitionType updateRequisitionType(Long id, RequisitionType requisitionType) {
        if (requisitionTypeRepository.existsById(id)) {
            return requisitionTypeRepository.save(requisitionType);
        }
        return null;
    }
    
    public boolean deleteRequisitionType(Long id) {
        if (requisitionTypeRepository.existsById(id)) {
            requisitionTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
