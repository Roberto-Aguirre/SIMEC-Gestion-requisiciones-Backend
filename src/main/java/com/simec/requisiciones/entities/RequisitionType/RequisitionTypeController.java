package com.simec.requisiciones.entities.RequisitionType;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/requisition-types")
public class RequisitionTypeController {
    
    @Autowired
    private RequisitionTypeService requisitionTypeService;
    
    @GetMapping
    public ResponseEntity<List<RequisitionType>> getAllRequisitionTypes() {
        List<RequisitionType> requisitionTypes = requisitionTypeService.getAllRequisitionTypes();
        return new ResponseEntity<>(requisitionTypes, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<RequisitionType> getRequisitionTypeById(@PathVariable Long id) {
        Optional<RequisitionType> requisitionType = requisitionTypeService.getRequisitionTypeById(id);
        return requisitionType.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<RequisitionType> createRequisitionType(@RequestBody RequisitionType requisitionType) {
        RequisitionType savedRequisitionType = requisitionTypeService.saveRequisitionType(requisitionType);
        return new ResponseEntity<>(savedRequisitionType, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<RequisitionType> updateRequisitionType(@PathVariable Long id, @RequestBody RequisitionType requisitionType) {
        RequisitionType updatedRequisitionType = requisitionTypeService.updateRequisitionType(id, requisitionType);
        if (updatedRequisitionType != null) {
            return new ResponseEntity<>(updatedRequisitionType, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRequisitionType(@PathVariable Long id) {
        if (requisitionTypeService.deleteRequisitionType(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
