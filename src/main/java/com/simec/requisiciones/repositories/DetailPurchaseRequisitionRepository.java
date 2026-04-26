package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.DetailPurchaseRequisition.DetailPurchaseRequisition;

@Repository
public interface DetailPurchaseRequisitionRepository extends JpaRepository<DetailPurchaseRequisition, Long> {

}
