package com.simec.requisiciones.entities.Commentary;

import java.util.List;

import com.simec.requisiciones.entities.PurchaseRequisition.PurchaseRequisition;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "commentaries")
public class Commentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "comment")
    private String comment;
    // @ManyToMany(targetEntity = PurchaseRequisition.class)
    // private List<PurchaseRequisition> purchaseRequisitions;
}
