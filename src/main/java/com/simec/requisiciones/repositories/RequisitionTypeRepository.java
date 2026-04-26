package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.RequisitionType.RequisitionType;

@Repository
public interface RequisitionTypeRepository extends JpaRepository<RequisitionType, Long> {

}
