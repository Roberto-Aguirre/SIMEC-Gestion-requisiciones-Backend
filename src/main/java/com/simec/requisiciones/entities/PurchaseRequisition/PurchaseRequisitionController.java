package com.simec.requisiciones.entities.PurchaseRequisition;

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

import com.simec.requisiciones.dtos.PurchaseRequisition.PurchaseRequisitionDTO;
import com.simec.requisiciones.entities.DetailPurchaseRequisition.DetailPurchaseRequisition;

@RestController
@RequestMapping("/api/purchase-requisitions")
public class PurchaseRequisitionController {
    
    @Autowired
    private PurchaseRequisitionService purchaseRequisitionService;
    
    @GetMapping
    public ResponseEntity<List<PurchaseRequisition>> getAllPurchaseRequisitions() {
        List<PurchaseRequisition> purchaseRequisitions = purchaseRequisitionService.getAllPurchaseRequisitions();
        return new ResponseEntity<>(purchaseRequisitions, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<PurchaseRequisition> getPurchaseRequisitionById(@PathVariable Long id) {
        Optional<PurchaseRequisition> purchaseRequisition = purchaseRequisitionService.getPurchaseRequisitionById(id);
        return purchaseRequisition.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<PurchaseRequisition> createPurchaseRequisition(@RequestBody PurchaseRequisitionDTO purchaseRequisition) {
        List<DetailPurchaseRequisition> purchaseDetails = purchaseRequisition.getDetails().stream()
                .map(detail -> DetailPurchaseRequisition.builder()
                        .product(detail.getProduct())
                        .quantity(detail.getQuantity())
                        .unitPrice(detail.getUnitPrice())
                        .build())
                .toList();

        PurchaseRequisition newPurchaseRequisition = PurchaseRequisition.builder()
                .description(purchaseRequisition.getDescription())
                .comments(null)
                .details()
                .status("PENDIENTE")
                .build();
        PurchaseRequisition savedPurchaseRequisition = purchaseRequisitionService.savePurchaseRequisition(purchaseRequisition);
        return new ResponseEntity<>(savedPurchaseRequisition, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<PurchaseRequisition> updatePurchaseRequisition(@PathVariable Long id, @RequestBody PurchaseRequisition purchaseRequisition) {
        PurchaseRequisition updatedPurchaseRequisition = purchaseRequisitionService.updatePurchaseRequisition(id, purchaseRequisition);
        if (updatedPurchaseRequisition != null) {
            return new ResponseEntity<>(updatedPurchaseRequisition, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePurchaseRequisition(@PathVariable Long id) {
        if (purchaseRequisitionService.deletePurchaseRequisition(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
